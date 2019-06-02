package pl.edu.agh.mwo.xlsPars;

import java.io.File;
import java.util.ArrayList;

public class ListFiles {

    private ArrayList<String> paths = new ArrayList<>();

    public ArrayList<String> getPaths() {
        return paths;
    }

    public void addPathToPaths(String path) {
        paths.add(path);
    }

    public void listAllFiles(String path) throws FolderNotFoundException{

        try {
            ArrayList<String> listFiles = new ArrayList<String>();
            File fold = new File(path);
            File[] listOfFiles = fold.listFiles();

            assert listOfFiles != null;
            for (File fileEntry : listOfFiles) {
                if (fileEntry.isDirectory()) {
                    listAllFiles(fileEntry.getPath());
                } else {
                    
                    if (fileEntry.getName().endsWith(".xls")){
                        // System.out.println(fileEntry.getAbsolutePath());
                        String pathToSave = fileEntry.getAbsolutePath();
                        addPathToPaths(pathToSave);
                        listFiles.add(fileEntry.getAbsolutePath());
                    }
    
    
                }
            }

        } catch (Exception e) {
            throw new FolderNotFoundException("Folder not found.");
        }
    }


    public class FolderNotFoundException extends Exception {
        public FolderNotFoundException(String message) {
            super(message);
        }
    }

}
