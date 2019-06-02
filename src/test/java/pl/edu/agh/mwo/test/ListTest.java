package pl.edu.agh.mwo.test;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import pl.edu.agh.mwo.xlsPars.ListFiles;

public class ListTest {
    String path = "D:\\Projects\\SAMPLE";

    @Ignore
    @Test
    public void listAllFilesTest() throws Exception {
        ListFiles listFiles = new ListFiles();
        listFiles.listAllFiles(path);
        Assert.assertEquals(3, listFiles.getPaths().size());
    }
}
