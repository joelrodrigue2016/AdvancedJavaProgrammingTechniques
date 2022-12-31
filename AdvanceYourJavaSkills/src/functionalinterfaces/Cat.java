package functionalinterfaces;

public abstract class Cat implements Printable {

	public String name;
	public int age;

	public Cat() {
	}

	public void print() {
		System.out.println("Meow!");

	}

}
