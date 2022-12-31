package collections;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> phonebook = new HashMap<>();
		phonebook.put("Joel ", 813455618);
		phonebook.put("Brenda g", 123123);
		phonebook.put("Jill", 555888);
		phonebook.put("Brenda", 22222);
		phonebook.put(null, 000);
		boolean isEmpty = phonebook.isEmpty();
		// phonebook.clear();
		if (isEmpty == true) {
			System.out.println("Nothing to see here folks!");

		} else {
			System.out.println(phonebook);
		}

	}

}
