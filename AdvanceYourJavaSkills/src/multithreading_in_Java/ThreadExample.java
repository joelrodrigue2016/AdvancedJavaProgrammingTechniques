/**
 * 
 */
package multithreading_in_Java;

/**
 * @author Joel another way to extend it is by using public class ThreadExample
 *         extends Thread
 */
public class ThreadExample extends Thread {

	@Override
	public void run() {
		int i = 1;
		while (i <= 100) {
			System.out.println(i + " " + this.getName());
			i++;
		}
	}

}
