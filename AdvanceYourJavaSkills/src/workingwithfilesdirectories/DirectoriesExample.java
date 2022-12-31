package workingwithfilesdirectories;

import java.io.File;
import java.io.FilenameFilter;

public class DirectoriesExample {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			///// This codes helps retunrning the files and not the directorties

			FilenameFilter filter = (file, filename) -> {
				return filename.contains(".");
			};

			String[] content = new File(".").list(filter);
			for (String file : content) {
				System.out.println(file);

			}
			new File("MytestJOel").mkdir();
			boolean a = new File("MytestJOel").mkdir();
			if (a == true) {
				System.out.println("------------------------------");
				System.out.println("Directory was made");

			} else if (a == false) {
				System.out.println("------------------------------");
				System.out.println("Directory was NOT made.");

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
