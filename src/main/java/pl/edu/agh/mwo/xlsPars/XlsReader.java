package pl.edu.agh.mwo.xlsPars;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import pl.edu.agh.mwo.model.Employee;
import pl.edu.agh.mwo.model.Issue;
import pl.edu.agh.mwo.model.Model;
import pl.edu.agh.mwo.model.Project;

public class XlsReader {
	
	public Model model = new Model(); 
	
	public static void main(String [] args) throws FileNotFoundException, IOException {
		XlsReader reader = new XlsReader();
		
		ArrayList<String> paths = new ArrayList<String>() { 
            { 
                add("C:\\GIT\\MWOlastProject\\dane\\reporter-dane\\2012\\01\\Kowalski_Jan.xls"); 
                add("C:\\GIT\\MWOlastProject\\dane\\reporter-dane\\2012\\01\\Nowak_Piotr.xls"); 
            } 
        }; 
        reader.getNextFiles(paths);
		reader.testfunc();
	}
	
	public String getNameOfEmployee(String path){
		String[] employeeName = path.split("\\\\|[.](?=[^.]+$)");
		return employeeName[employeeName.length-2];	
	}
	
	
	public void getNextFiles(ArrayList<String> paths) throws FileNotFoundException, IOException{
		for (String path : paths){
			analizeExcel(path);				
		}
	}
	
	public void analizeExcel(String path) throws FileNotFoundException, IOException{
		HSSFWorkbook wb = new HSSFWorkbook(new FileInputStream(path));
		int numberOfSheets = wb.getNumberOfSheets();
		String employeeName = getNameOfEmployee(path);
//		Create or edit employee
		Employee foundEmployee = model.getEmployee(employeeName);
		if (foundEmployee == null) {
			Employee employee = new Employee();
			employee.setName(employeeName);
			model.addEmployee(employee);
			foundEmployee = employee;
		}
		for (int sheetId = 0; sheetId < numberOfSheets; sheetId++) {
			List<List<String>> sheetContent = new ArrayList<List<String>>();
			String projectName = wb.getSheetName(sheetId);
//			Create or edit project			
			Project foundProject = model.getProject(projectName);
			if (foundProject == null) {
				Project project = new Project();
				project.setProjectName(projectName);
				model.setProject(project);
				foundProject = project;
			}
					
			Sheet getSheet = wb.getSheet(projectName);		
			int nrow = getSheet.getLastRowNum();	
			for (int row = 1;row<nrow;row++) {			
//				Create new issue 
				Row getRow = getSheet.getRow(row);
				Issue issue = new Issue();
				issue.setDate(getRow.getCell(0).toString());
				issue.setIssueName(getRow.getCell(1).getStringCellValue());		
				issue.setHours(getRow.getCell(2).getNumericCellValue());
				issue.setProject(projectName);
//				Add issue to project
				foundProject.setIssues(issue);
//				Add issue to employee
				foundEmployee.addIssue(issue);
			}
		}	
	}
	
	public void testfunc() {
		System.out.println("EMPLOYEE:");
		for (Employee employee: model.employees) {
			for (Issue issue : employee.getIssues()) {
				System.out.println(employee.getName() + " => " + issue.getDate() + " | "
			+ issue.getName() + " | " + issue.getHours() + " | " + issue.getYear() + " | " + issue.getProject());
			}
		}
		System.out.println("\nPROJECT:");
		for (Project project: model.projects) {
			for (Issue issue : project.getIssues()) {
				System.out.println(project.getName() + " => " + issue.getDate() + " | " 
			+ issue.getName() + " | " + issue.getHours() + " | " + issue.getYear());
			}
		}
	}
	
	
}