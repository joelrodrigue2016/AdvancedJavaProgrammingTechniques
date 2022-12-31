package introToGenerics;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Joel
 *
 */
public class GenericsExample {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/// Exampple without generics

		List names = new ArrayList<>();
		names.add("Joel");
		names.add("Kender");
		names.add("John");
		String name = (String) names.get(0);
		/// advantage I can add other data types
		names.add(7);
		System.out.println(name);

		//// example with generics
		List<String> names2 = new ArrayList();
		names2.add("Richard");
		names2.add("Joel");
		names2.add("Kender");
		names2.add("John");
		/// disadvantage cannot add other data types
		// names2.add(7);
		System.out.println(names2.get(0));

	}

}
