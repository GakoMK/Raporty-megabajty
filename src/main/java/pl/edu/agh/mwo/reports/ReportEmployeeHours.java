package pl.edu.agh.mwo.reports;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import pl.edu.agh.mwo.model.Employee;
import pl.edu.agh.mwo.model.Issue;
import pl.edu.agh.mwo.model.Model;
import pl.edu.agh.mwo.model.Project;

public class ReportEmployeeHours {
	
	private Model model;
	private String year;
	
	public ReportEmployeeHours(Model model) {
		this.model = model;
	}
	
	public HashMap<String, HashMap<String, String>> prepereMapToDiagramC(String employeeFullName){
		HashMap<String, HashMap<String, String>> resultList = new HashMap<String, HashMap<String, String>>();
		Employee employee = model.getEmployee(employeeFullName);
		if (employee != null) {
			ArrayList<Issue> issues = new ArrayList<Issue>();
			for (Issue issue : issues) {
				if(resultList.containsKey(issue.getMonth())) {
					HashMap<String, String> projectList = resultList.get(issue.getMonth());
					if(projectList.containsKey(issue.getProject())) {
						String hourStr = projectList.get(issue.getProject());
						Double hour = Double.valueOf(hourStr) + Double.valueOf(issue.getHours());
						projectList.put(issue.getProject(), hour.toString());
					} else {
						projectList.put(issue.getProject(), issue.getHours() + "");
					}
					resultList.put(issue.getMonth(), projectList);
				} else {
					HashMap<String, String> projectList = new HashMap<String, String>();
					projectList.put(issue.getProject(), issue.getHours() + "");
					resultList.put(issue.getMonth(), projectList);
				}
			}
		return resultList;
		}
    return null;
	}
	
	
	
	public ArrayList<ArrayList<String>> prepereDataToDiagramC(Model model, String employeeFullName){
		HashMap<String, HashMap<String, String>> data = prepereMapToDiagramC(employeeFullName);
		ArrayList<ArrayList<String>> resultList = new ArrayList<ArrayList<String>>();
		
		for (Map.Entry<String, Object> entry : data.entrySet()) {
			ArrayList<String> resultList2 = new ArrayList<String>();
			for(String value2 : value.values()) {
		    	resultList2.add(e)
		    }
		}
	
		
		
		return null;
	}
	
	public ArrayList<ArrayList<String>> prepereDataToDiagramA(Model model, String year) {
		ArrayList<ArrayList<String>> resultArray = new ArrayList<ArrayList<String>>();
		for (Employee employee : model.getEmployees()) {
			System.out.println();
			ArrayList<String> x = new ArrayList<>(Arrays.asList(employee.getName(), String.valueOf(employee.totalWorkingTimeInYear(year))));  
			resultArray.add(x);
		}
		return resultArray;
	}
	
	public ArrayList<ArrayList<String>>  prepereDataToDiagramB(Model model, String year) {
		ArrayList<ArrayList<String>> resultArray = new ArrayList<ArrayList<String>>();
		for (Project project : model.getProjects()) {
			System.out.println();
			ArrayList<String> x = new ArrayList<>(Arrays.asList(project.getName(), String.valueOf(project.totalWorkingTimeInYear(year))));  
			resultArray.add(x);
		}
		return resultArray;
	}
	
	public void printConsole(ArrayList<ArrayList<String>> resultArray) {
		for (ArrayList<String> row: resultArray) {
			System.out.println(row.get(0) + " | " + row.get(1));
		}
		
	}

	
}
