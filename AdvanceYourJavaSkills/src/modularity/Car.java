package modularity;

public class Car extends Vehicle {
	public void dog() {
		System.out.println("woof, woof, woof!");
	}

	public static void main(String[] args) {
		Car car = new Car();
		car.sum(5, 10);
	}

}
