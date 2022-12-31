package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String, Integer> phonebook = new LinkedHashMap<>(4, 0.75f, false);
		// TODO Auto-generated method stub

		phonebook.put("Kevin", 813455618);
		phonebook.put("Jill", 12345);
		phonebook.put("Brenda", 98765);
		phonebook.put("Gary", 22222);

		for (Map.Entry<String, Integer> entry : phonebook.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(key + "'s phone number is: " + val);

		}

	}

}
