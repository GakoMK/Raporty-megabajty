package pl.edu.agh.mwo.model;

import java.util.ArrayList;

public class Model {
    public ArrayList<Employee> employees = new ArrayList<Employee>();
    public ArrayList<Project> projects = new ArrayList<Project>();

    public Employee getEmployee(String fullName) {
        for (Employee e : employees) {
            if (e.getName().equals(fullName)) {
                return e;
            }
        }
        return null;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }
    
    public Project getProject(String fullName) {
        for (Project p : projects) {
            if (p.getName().equals(fullName)) {
                return p;
            }
        }
        return null;
    }
    
    public void setProject(Project project) {
    	projects.add(project);
    }
    
//    public 
    
    
}
