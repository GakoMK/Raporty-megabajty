package pl.edu.agh.mwo.model;

import java.util.ArrayList;

public class Project {
    private String projectName;
    private ArrayList<Issue> issues = new ArrayList<Issue>();

    public String getName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public ArrayList<Issue> getIssues() {
        return issues;
    }

    public void setIssues(Issue issue) {
        this.issues.add(issue);
    }
    
    public double totalWorkingTimeInYear(String year) {
		return issues.stream()
				.filter(x -> x.getYear().equals(year))
				.mapToDouble(x -> x.getHours())
				.sum();
	}
    
}
