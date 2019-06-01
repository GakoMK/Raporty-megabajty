package pl.edu.agh.mwo.model;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String fullName;
    private List issues = new ArrayList<Issue>();

    public String getName() {
        return fullName;
    }

    public void setName(String fullName) {
        this.fullName = fullName;
    }

    public List<Issue> getIssues() {
        return issues;
    }

    public void setIssues() {
        this.issues = issues;
    }

    public void addIssue(Issue issue) {
        this.issues.add(issue);
    }
    
//    public double totalWorkingTime() {
//    	return issues.stream().mapToDouble(x -> x.getHours()).sum();
//    }
    
//  public double totalWorkingTimeInYear(String year) {
//		return issues.stream()
//				.filter(x -> x.getYear().equals(year))
//				.mapToDouble(x -> x.getHours())
//				.sum();
//	}
    
}
