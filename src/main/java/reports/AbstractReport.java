/**
 * 
 */
/**
 * @author judyta
 *
 */
package reports;

import pl.edu.agh.mwo.Model;
import java.util.ArrayList;

public abstract class AbstractReport {
	
	private Model dataModel;
	private String[][] resultArray;
	
	public AbstractReport(Model model) {
		this.dataModel = model;
	}
	
	public void process() {
		//todo zaincijalizuj 
	};
	
	public void printConsole(String[][] resultArray) {
		//dimensions of resultArray
		for (int i; i < resultArray.length; i++) {
			for (int j; i < resultArray[i].length; j++) {
				System.out.print(resultArray[i][j]);
			}
		}
	}
}
