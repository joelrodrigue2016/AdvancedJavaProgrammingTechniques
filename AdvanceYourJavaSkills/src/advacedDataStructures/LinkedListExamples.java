package advacedDataStructures;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LinkedListExamples {

	public static void main(String[] args) {
		String file = "example.txt";
		String line;
		FileReader fReader;
		// TODO Auto-generated method stub
		try {
			BufferedReader bReader = new BufferedReader(new FileReader(file));
			while ((line = bReader.readLine()) != null) {

				System.out.println(line);

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
