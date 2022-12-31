package workingwithfilesdirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
 * 
 */
public class FileCopyExample {
	/**
	 * 
	 * @param args
	 * @param REPLACE_EXISTING
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path source = Paths.get("C:\\Users\\Joel\\eclipse-workspace\\AdvanceYourJavaSkills\\example.txt");
		Path dest = Paths.get("C:\\Users\\Joel\\eclipse-workspace\\AdvanceYourJavaSkills\\new.txt");
		try {
			Files.copy(source, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
