package pl.edu.agh.mwo.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pl.edu.agh.mwo.model.Employee;
import pl.edu.agh.mwo.model.Issue;
import pl.edu.agh.mwo.model.Model;

public class EmployeeTest {

    private Model model;

    @Before
    public void setUp() {
        Employee e1 = new Employee();
        e1.setName("Marian Iks");
        Issue i1 = new Issue();
        e1.setIssues(i1);

    }

    @Test
    public void createEmployeeAndIssueTest() {
        Assert.assertTrue(model.getEmployee("Marian Iks"));
    }
}
