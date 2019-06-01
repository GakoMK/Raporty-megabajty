package pl.edu.agh.mwo.model;

import java.util.ArrayList;

public class Model {
    public static ArrayList<Employee> employees = new ArrayList<Employee>();
    public static ArrayList<Project> projects = new ArrayList<Project>();

    public Employee getEmployee(String fullName) {
        for (Employee e : employees) {
            if (e.getName().equals(fullName)) {
                return e;
            }
        }
        return null;
    }
}
