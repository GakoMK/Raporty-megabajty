package pl.edu.agh.mwo.model;

import java.util.ArrayList;

public class Employee {
    private String fullName;
    private ArrayList issues = new ArrayList<Issue>();

    public String getName() {
        return fullName;
    }

    public void setName(String fullName) {
        this.fullName = fullName;
    }

    public ArrayList getIssues() {
        return issues;
    }

    public void setIssues() {
        this.issues = issues;
    }

    public void addIssue(Issue issue) {
        this.issues.add(issue);
    }
}
