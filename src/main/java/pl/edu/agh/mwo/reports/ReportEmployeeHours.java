package pl.edu.agh.mwo.reports;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import pl.edu.agh.mwo.model.Employee;
import pl.edu.agh.mwo.model.Model;

public class ReportEmployeeHours extends AbstractReport {
	
	//private String[][] resultArray;

	public ReportEmployeeHours(Model model) {
		super(model);
	}
	
	public static ArrayList<ArrayList<String>>  transformIntoArray(Model model, String year) {
		ArrayList<ArrayList<String>> resultArray = new ArrayList<ArrayList<String>>();
		for (Employee employee : model.getEmployees()) {
			List<String> x = new ArrayList<>(Arrays.asList(employee.getName(), String.valueOf(employee.totalWorkingTimeInYear(year))));  
		}
		return resultArray;
	}

	
}
