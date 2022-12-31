package workingwithfilesdirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path path = Paths.get("example.txt");

		try {
			//// delete a file
			Files.deleteIfExists(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Path path2 = Paths.get("C:\\Users\\Joel\\eclipse-workspace");
		System.out.println("Root:---> " + path2.getRoot());
		System.out.println("parent directory::---> " + path2.getParent());
		System.out.println("Amount of document::---> " + path2.getNameCount());
		System.out.println("File name:--->" + path2.getFileName());
		System.out.println("File system::---> " + path2.getFileSystem());

	}
}
