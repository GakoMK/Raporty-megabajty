/**
 * 
 */
/**
 * @author judyta
 *
 */
package pl.edu.agh.mwo.reports;
import pl.edu.agh.mwo.model.*;

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
		for (int i = 0; i < resultArray.length; i++) {
			for (int j = 0; i < resultArray[i].length; j++) {
				System.out.print(resultArray[i][j]);
			}
		}
	}
}
