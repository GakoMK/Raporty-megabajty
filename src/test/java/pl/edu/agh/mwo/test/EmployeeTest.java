package pl.edu.agh.mwo.test;

import org.junit.Assert;
import org.junit.Test;
import pl.edu.agh.mwo.model.Employee;
import pl.edu.agh.mwo.model.Issue;
import pl.edu.agh.mwo.model.Model;

public class EmployeeTest {

    @Test
    public void createEmployeeAndIssueTest() {
        Employee employee = new Employee();
        employee.setName("Jan Kowalski");
        Issue issue = new Issue();
        issue.setDate("11.01.2019");
        issue.setHours(1600);
        issue.setIssueName("Testy");
        employee.addIssue(issue);
        Model model = new Model();
        model.addEmployee(employee);
        Assert.assertEquals(employee, model.getEmployee("Jan Kowalski"));
    }

    @Test
    public void getIssuesFromModelByEmployeeTest() {
        Employee employee = new Employee();
        employee.setName("Jan Kowalski");
        Issue issue = new Issue();
        issue.setDate("11.01.2019");
        issue.setHours(1600);
        issue.setIssueName("Testy");
        employee.addIssue(issue);
        Model model = new Model();
        model.addEmployee(employee);
        Assert.assertEquals(1, model.getEmployee("Jan Kowalski").getIssues().size());
    }
}
