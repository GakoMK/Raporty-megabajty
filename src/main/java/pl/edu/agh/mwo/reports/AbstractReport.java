/**
 * 
 */
/**
 * @author judyta
 *
 */
package pl.edu.agh.mwo.reports;

import java.util.ArrayList;

import pl.edu.agh.mwo.model.Model;

public abstract class AbstractReport {
	
	private Model dataModel;
	private String[][] resultArray;
	
	public AbstractReport(Model model) {
		this.dataModel = model;
	}
	
//	public void process() {
//		//todo zaincijalizuj 
//	};
	
	public void printConsole(ArrayList<ArrayList<String>> resultArray) {
		//dimensions of resultArray
		for (ArrayList<String> row: resultArray) {
			System.out.println(row.get(0) + " | " + row.get(1));
		}
	}
	
	public void printToExcel(String[][] resultArray) {
		
	}
}
