package pl.edu.agh.mwo.xlsPars;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import pl.edu.agh.mwo.model.Employee;
import pl.edu.agh.mwo.model.Model;

public class XlsReader {
	
	public static Model model = new Model(); 
	
	
	public static String getNameOfEmployee(String path){
		String employee = path.split("\\")[-1].split("[.](?=[^.]+$)")[0];		
		return employee;
	}
	
	
	public static void getNextFiles(ArrayList<String> paths) {
		for (String path : paths){
			analizeExcel(path);				
		}
	}
	
	public static void analizeExcel(String path){
		XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(path));
		int numberOfSheets = wb.getNumberOfSheets();
		
		String employeeName = getNameOfEmployee(path);
		Employee foundEmployee = model.getEmployee(employeeName);
		
		
		for (int sheet = 0; sheet < numberOfSheets; sheet++) {
			List<List<String>> sheetContent = new ArrayList<List<String>>();
			String projectName = wb.getSheetName(sheet);
			Sheet getSheet = wb.getSheet(projectName);				
			int nrow = getSheet.getLastRowNum();
		}
	}
		
	for (int sheet = 0; sheet < numberOfSheets; sheet++) {
		List<List<String>> sheetContent = new ArrayList<List<String>>();
		String projectName = wb.getSheetName(sheet);
		Sheet getSheet = wb.getSheet(projectName);				
		int nrow = getSheet.getLastRowNum();
	}
	
	
	
	
	public static Map <String, List<List<String>>> returnFileContent() throws FileNotFoundException, IOException{
		Map <String, List<List<String>>> ContentOfFile = new HashMap<String, List<List<String>>>();
		XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream("f1-results.xlsx"));
		int numberOfSheets = wb.getNumberOfSheets();		
		
		
		for (int sheet = 0; sheet < numberOfSheets; sheet++) {
			List<List<String>> sheetContent = new ArrayList<List<String>>();
			String sheetName = wb.getSheetName(sheet);
			Sheet getSheet = wb.getSheet(sheetName);				
			int nrow = getSheet.getLastRowNum();	
			for (int row = 0;row<nrow;row++) {			
				List<String> listOfCellsValues = new ArrayList<String>();
				Row getRow = getSheet.getRow(row);
				for (int col = 0; col<getRow.getLastCellNum();col++) {
					Cell cell = getRow.getCell(col);
					if (cell != null) {
						listOfCellsValues.add(cell.toString());
					} else {
						listOfCellsValues.add("");
					}
				}
				sheetContent.add(listOfCellsValues);
			}
			ContentOfFile.put(sheetName, sheetContent);			
		}
		return ContentOfFile;
	}
}
