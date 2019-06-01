package pl.edu.agh.mwo.model;

import java.util.ArrayList;

public class Project {
    private String projectName;
    private ArrayList<Issue> issues = new ArrayList<Issue>();

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public ArrayList<Issue> getIssues() {
        return issues;
    }

    public void setIssues(ArrayList<Issue> issues) {
        this.issues = issues;
    }
}
