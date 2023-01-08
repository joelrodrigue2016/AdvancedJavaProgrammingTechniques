package modularity;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner scanner = new Scanner(System.in);) {
			Modules modules = new Modules();

			System.out.println("Please enter a number: ");
			int number = scanner.nextInt();
			modules.modules(number);
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.err.print("Oops something went wrong!!!");
		}
	}

}
