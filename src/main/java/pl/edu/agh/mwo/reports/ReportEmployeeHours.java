package pl.edu.agh.mwo.reports;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import pl.edu.agh.mwo.model.Employee;
import pl.edu.agh.mwo.model.Model;

public class ReportEmployeeHours {
	
	private Model model;
	private String year;
	
	public ReportEmployeeHours(Model model, String year) {
		this.model = model;
		this.year = year;
	}
	
	//private ArrayList<ArrayList<String>> resultArray = transformIntoArray(model, year);

	public ArrayList<ArrayList<String>>  transformIntoArray(Model model, String year) {
		ArrayList<ArrayList<String>> resultArray = new ArrayList<ArrayList<String>>();
		for (Employee employee : model.getEmployees()) {
			System.out.println();
			List<String> x = new ArrayList<>(Arrays.asList(employee.getName(), String.valueOf(employee.totalWorkingTimeInYear(year))));  
		}
		return resultArray;
	}
	
	public void printConsole(ArrayList<ArrayList<String>> resultArray) {
		for (ArrayList<String> row: resultArray) {
			System.out.println(row.get(0) + " | " + row.get(1));
		}
	}

	
}
