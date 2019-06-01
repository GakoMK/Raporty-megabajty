package pl.edu.agh.mwo.model;

import java.util.ArrayList;

public class Employee {
    private String name;
    private ArrayList issues = new ArrayList<Issue>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList getIssues() {
        return issues;
    }

    public void setIssues(ArrayList issues) {
        this.issues = issues;
    }
}
