package java.pl.edu.agh.mwo.test;

import org.junit.Assert;
import org.junit.Test;
import pl.edu.agh.mwo.xlsPars.ListFiles;

public class ListTest {
    String path = "D:\\Projects\\SAMPLE";

    @Test
    public void listAllFilesTest() {
        ListFiles listFiles = new ListFiles();
        listFiles.listAllFiles(path);
        Assert.assertEquals(3, listFiles.getPaths().size());
    }
}
