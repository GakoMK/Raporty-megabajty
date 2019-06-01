package pl.edu.agh.mwo.model;

import java.util.ArrayList;

public class Model {
    public ArrayList<Employee> employees = new ArrayList<Employee>();
    public ArrayList<Project> projects = new ArrayList<Project>();

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public ArrayList<Project> getProjects() {
        return projects;
    }

    public Employee getEmployee(String fullName) {
        for (Employee e : employees) {
            if (e.getName().equals(fullName)) {
                return e;
            }
        }
        return null;
    }

    public void addEmployeeToArrayList(Employee employee) {
        this.employees.add(employee);
    }
}
