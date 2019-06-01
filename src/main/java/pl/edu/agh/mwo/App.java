package pl.edu.agh.mwo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;


public class App {
	
    public static void main(String[] args) throws IOException {

		// C:\Users\Yogi\Downloads\reporter-dane\reporter-dane
		// Tree("C:\Users\Yogi\Downloads\reporter-dane\reporter-dane");
		listAllFiles("C:\\Users\\Yogi\\Downloads\\reporter-dane\\reporter-dane");

	}
	

	// public static void Tree(String folderPath) throws IOException{
	// 	try {

    //         final File folder = new File("C:\\Users\\Yogi\\Downloads\\reporter-dane\\reporter-dane");
    //         listAllFiles(folder);
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     }
	// }
	
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
