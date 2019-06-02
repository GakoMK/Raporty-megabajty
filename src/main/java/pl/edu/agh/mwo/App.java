package pl.edu.agh.mwo;

import java.io.IOException;

import pl.edu.agh.mwo.model.Model;
import pl.edu.agh.mwo.xlsPars.ListFiles;
import pl.edu.agh.mwo.xlsPars.XlsReader;
import pl.edu.agh.mwo.xlsPars.ListFiles.FolderNotFoundException;

public class App {

  public static void main(String[] args) throws IOException, FolderNotFoundException {

	final Model model = new Model();


	//String pathToData = args[0];
    // do testów
    try {
      String inputPath = "E:\\agh\\Raporty-megabajty\\dummyData";
      ListFiles listFilesPath = new ListFiles();
      listFilesPath.listAllFiles(inputPath);
      System.out.println("Katalog zostal zeskanowany");
      XlsReader xlsReader = new XlsReader(model);
      xlsReader.getNextFiles(listFilesPath.getPaths());
      xlsReader.testfunc();
      System.out.println("Dane zosta�y zaczytane");
    } catch (FolderNotFoundException e) {
      System.out.println(e);
    }


    MainMenu.Run(model);

  }
}
