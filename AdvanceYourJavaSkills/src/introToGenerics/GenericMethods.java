package introToGenerics;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")

public class GenericMethods {
	static Character[] charArray = { 'h', 'e', 'l', 'l', '0' };
	static Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	static Boolean[] boolArray = { true, false, true };

	public static <T> List<T> arrayToList(T[] array, List<T> list) {
		for (T object : array) {
			list.add(object);

		}
		return list;

	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Character> charList = arrayToList(charArray, new ArrayList<>());
		List<Boolean> booList = arrayToList(boolArray, new ArrayList<>());
		List<Integer> intList = arrayToList(intArray, new ArrayList<>());
		for (int i = 0; i < 8; i++) {
			System.out.println(intList.get(i));
		}

	}

}
