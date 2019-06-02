package pl.edu.agh.mwo.model;

public class Issue {
    private String date;
    private double hours;
    private String issueName;
    private String projectName;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public String getYear() {
    	return this.date.substring(7);
	}
    
    public void setProject(String project) {
    	this.projectName = project;
    }
    
    public String getProject() {
    	return this.projectName;
	}
    
    public String getName() {
        return issueName;
    }

    public void setIssueName(String issueName) {
        this.issueName = issueName;
    }
}
