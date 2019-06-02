package pl.edu.agh.mwo.reports;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExportToXls {
	
	public void printXls(ArrayList<ArrayList<String>> model){
		
		 // Create a Workbook
        Workbook workbook = new XSSFWorkbook(); // new HSSFWorkbook() for generating `.xls` file

        // Create a Sheet
        Sheet sheet = workbook.createSheet("Employee");

        // Create a Row
        Row headerRow = sheet.createRow(0);
        Cell cell0 = headerRow.createCell(0);
		cell0.setCellValue("Full name");
		Cell cell00 = headerRow.createCell(1);
		cell00.setCellValue("Hours");

        int cnt = 1;
        for (ArrayList<String> row: model) {
        	Row dataRow = sheet.createRow(cnt);
        	for (int i = 0; i < row.size(); i++) {
            	
        		Cell cell1 = dataRow.createCell(0);
        		cell1.setCellValue(row.get(0));
        		//System.out.println(row.get(i));
        		Cell cell2 = dataRow.createCell(1);
        		cell2.setCellValue(row.get(1));
			}
        	cnt++;
		}

        try {
			FileOutputStream fileOut = new FileOutputStream("Raport1.xlsx");
			workbook.write(fileOut);
			fileOut.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
