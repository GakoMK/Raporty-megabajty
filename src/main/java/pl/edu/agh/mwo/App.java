package pl.edu.agh.mwo;

import java.io.IOException;

import pl.edu.agh.mwo.xlsPars.ListFiles;
import pl.edu.agh.mwo.xlsPars.ListFiles.FolderNotFoundException;

public class App {

  public static void main(String[] args) throws IOException, FolderNotFoundException {

    // do testów
    try {
      String inputPath = "C:\\Users\\Yogi\\Documents\\JAVA\\Visual_Studio_Code\\megabajty\\Raporty-megabajtty\\dummyData";
      ListFiles listFilesPath = new ListFiles();
      listFilesPath.listAllFiles(inputPath);
    } catch (FolderNotFoundException e) {
      // e.printStackTrace();
      System.out.println(e);
    }

    // String pathToData = args[0];
    // MainMenu.Run();

  }
}
