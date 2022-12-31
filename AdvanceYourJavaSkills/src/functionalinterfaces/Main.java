package functionalinterfaces;

/**
 * 
 * @author Joel
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s = new Square(4);
		Shapes shapes = Square::calculateArea;
		System.out.println("Area: " + shapes.getArea(s));
	}
}
