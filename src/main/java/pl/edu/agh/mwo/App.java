package pl.edu.agh.mwo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {
	
	public static void main(String args[]) throws Exception {
		//printTree("E:\\");
	}
	
	public static void printTree(String path) throws IOException {
		Files.walk(Paths.get(path))
        .filter(Files::isRegularFile)
        .forEach(System.out::println);
	}
	
}
