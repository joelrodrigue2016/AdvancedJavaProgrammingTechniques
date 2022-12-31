package collections;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// sets
		// lists
		// queue
		// maps
		LinkedList<String> myList = new LinkedList();
		myList.add("A");
		myList.add("B");
		/// with linkedlists we can specify the position of the items
		myList.add(1, "C");
		System.out.println(myList);
		// myList.removeLast();
		myList.remove("A");

		System.out.println(myList);
	}

}
