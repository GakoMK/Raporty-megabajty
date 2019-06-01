package pl.edu.agh.mwo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class App {
	
    public static void main(String[] args) throws IOException {

	  //listAllFiles("C:\\Users\\Yogi\\Downloads\\reporter-dane\\reporter-dane");
      
      String pathToData = args[0];
      
      MainMenu.Run();

	}
	
	public static ArrayList<String> listAllFiles(String path) {
		ArrayList<String> listFiles = new ArrayList<String>();
		File fold = new File(path);
		File[] listOfFiles = fold.listFiles();

        for (File fileEntry : listOfFiles) {
            if (fileEntry.isDirectory()) {
                listAllFiles(fileEntry.getPath());
            } else {
				System.out.println(fileEntry.getAbsolutePath());
				listFiles.add(fileEntry.getAbsolutePath());
            }
        }
		return listFiles;
    }
	
}
