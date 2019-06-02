package pl.edu.agh.mwo;

import java.io.IOException;

import pl.edu.agh.mwo.xlsPars.ListFiles;


public class App {
	
    public static void main(String[] args) throws IOException {

      
      // do testów
      String inputPath = "C:\\Users\\Yogi\\Documents\\JAVA\\Visual_Studio_Code\\megabajty\\Raporty-megabajty\\dummyData";
      ListFiles listFilesPath = new ListFiles();
      listFilesPath.listAllFiles(inputPath);

      //String pathToData = args[0];
      // MainMenu.Run();

	}
}
