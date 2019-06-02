package pl.edu.agh.mwo.reports;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import pl.edu.agh.mwo.model.Employee;
import pl.edu.agh.mwo.model.Model;
import pl.edu.agh.mwo.model.Project;

public class ReportEmployeeHours {
	
	private Model model;
	private String year;
	
	public ReportEmployeeHours(Model model, String year) {
		this.model = model;
		this.year = year;
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
