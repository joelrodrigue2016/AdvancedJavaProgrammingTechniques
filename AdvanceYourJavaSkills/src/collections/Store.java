package collections;

import java.util.LinkedList;

public class Store {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("rawtypes")
		LinkedList<Customer> queue = new LinkedList();
		queue.add(new Customer("Sally"));
		queue.add(new Customer("Ben"));
		queue.add(new Customer("Emma"));
		queue.add(new Customer("Fred"));
		System.out.println(queue);
		serveCustomer(queue);

		System.out.println(queue);
	}

	static void serveCustomer(LinkedList<Customer> queue) {
		Customer c = queue.poll();
		c.serve();
	}

}
