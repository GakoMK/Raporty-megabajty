package pl.edu.agh.mwo.test;

import org.junit.Assert;
import org.junit.Test;
import pl.edu.agh.mwo.model.Issue;

public class IssueTest {

    @Test
    public void getMonthTest() {
        Issue issue = new Issue();
        issue.setDate("11.01.2019");
        issue.setHours(1600);
        issue.setIssueName("Testy");
        Assert.assertEquals(1, issue.getMonth());
    }

    @Test
    public void getYearTest() {
        Issue issue = new Issue();
        issue.setDate("11.01.2019");
        issue.setHours(1600);
        issue.setIssueName("Testy");
        Assert.assertEquals(2019, issue.getYear());
    }
}
