package modularity;

import java.util.Scanner;

public class Modules {

	public void modules(int number) {
		try (// TODO Auto-generated method stub
				Scanner scanner = new Scanner(System.in)) {

			System.out.println("-----------------------------------");
			for (int i = 0; i <= number; i++) {
				System.out.println("-----------------------------------");
				for (int j = 0; j <= number; j++) {

					System.out.printf("%d X %d = %d\n", i, j, i * j);

				}
			}
		}
		System.out.println("---------------end-----------------");

	}

}
