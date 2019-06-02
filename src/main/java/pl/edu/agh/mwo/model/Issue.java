package pl.edu.agh.mwo.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    	Pattern pattern = Pattern.compile("(\\d{4})$");
    	Matcher matcher = pattern.matcher(this.date);
    	if (matcher.find())
    	{
    	    return matcher.group(1);
    	}
	return null;
    }
    
    public String getMonth() {
    	Pattern pattern = Pattern.compile("[\\-.](\\w{3})[\\-.]");
    	Matcher matcher = pattern.matcher(this.date);
    	if (matcher.find())
    	{
    	    return matcher.group(1);
    	}
	return null;
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
