package functionalinterfaces;

public class LambdasExplanation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Printable lamdaPrintable = (s) -> System.out.println("Meow" + s);

		printThing(lamdaPrintable);
	}

	private static void printThing(Printable thing) {
		// TODO Auto-generated method stub
		thing.print("!");
	}

}