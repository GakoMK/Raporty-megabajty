package pl.edu.agh.mwo;

import java.io.IOException;

import pl.edu.agh.mwo.xlsPars.ListFiles;
import pl.edu.agh.mwo.xlsPars.ListFiles.UserNotFoundException;

public class App {

  public static void main(String[] args) throws IOException, UserNotFoundException {

    // do testów
    try {
      String inputPath = "C:\\Users\\Yogi\\Documents\\JAVA\\Visual_Studio_Code\\megabajty\\Raporty-megabajtoy\\dummyData";
      ListFiles listFilesPath = new ListFiles();
      listFilesPath.listAllFiles(inputPath);
    } catch (UserNotFoundException e) {
      // e.printStackTrace();
      System.out.println(e);
    }

    // String pathToData = args[0];
    // MainMenu.Run();

  }
}
