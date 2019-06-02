package pl.edu.agh.mwo.reports;
import pl.edu.agh.mwo.model.*;

public class ReportEmployeeHours extends AbstractReport {
	
	public ReportEmployeeHours(Model model) {
		super(model);
		// TODO Auto-generated constructor stub
	}

	private Model dataModel;
	private String[][] resultArray;

	public void ReportEmployeeHours(Model model){
//		for (Employee employee: model.employees) {
//			System.out.println(employee.totalWorkingTimeInYear("2012"));
//			for (Issue issue : employee.getIssues()) {
//				System.out.println(employee.getName() + " => " + issue.getDate() + " | "
//			+ issue.getName() + " | " + issue.getHours() + " | " + issue.getYear() + " | " + issue.getProject());
//			}
//		}
//		System.out.println("\nPROJECT:");
//		for (Project project: model.projects) {
//			for (Issue issue : project.getIssues()) {
//				System.out.println(project.getName() + " => " + issue.getDate() + " | " 
//			+ issue.getName() + " | " + issue.getHours() + " | " + issue.getYear());
//			}
//		}
	}

}
