package workingwithfilesdirectories;

import java.io.File;
import java.io.IOException;

public class FileCreationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File myFile = new File("C:\\Users\\Joel\\eclipse-workspace\\Testamazon\\example.txt");
		try {
			/// using a boolean to verify if file was created or not
			boolean fileCreated = myFile.createNewFile();

			System.out.println(fileCreated);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
