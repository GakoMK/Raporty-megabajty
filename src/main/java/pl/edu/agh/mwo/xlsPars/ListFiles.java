package pl.edu.agh.mwo.xlsPars;

import java.io.File;
import java.util.ArrayList;

public class ListFiles {

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
