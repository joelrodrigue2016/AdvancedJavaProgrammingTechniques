package introToGenerics;

/**
 * 
 * @author Joel
 *
 */
public class Varargs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String item1 = "Apples";
		String item2 = "Oranges";
		String item3 = "Pears";
		// String[] shopping = { "bread", "milk", "eggs", "bananas" };
		printShoppinglist(item1, item2, item3);
		printShoppinglist("bread", "milk", "eggs", "bananas");

	}

//	private static void printShoppinglist(String item1, String item2) {
//		// TODO Auto-generated method stub
//		System.out.println("Printing shopping list: ");
//		System.out.println("item 1: " + item1);
//		System.out.println("item 2: " + item2);
//
//		System.out.println();
//	}
//
//	private static void printShoppinglist(String item1, String item2, String item3) {
//		// TODO Auto-generated method stub
//		System.out.println("Printing shopping list: ");
//		System.out.println("item 1: " + item1);
//		System.out.println("item 2: " + item2);
//		System.out.println("item 3: " + item3);
//		System.out.println();
//	}
	private static void printShoppinglist(String... items) {
		System.out.println("Shopping list: ");
		for (int i = 0; i < items.length; i++) {
			System.out.println(i + 1 + ": " + items[i]);
		}
	}
}
