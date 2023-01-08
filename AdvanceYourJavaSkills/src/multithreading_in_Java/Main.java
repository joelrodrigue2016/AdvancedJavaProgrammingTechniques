/**
 * 
 */
package multithreading_in_Java;

/**
 * @author Joel
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ThreadExample thread1 = new ThreadExample();
		 * thread1.setName("My first thread"); thread1.start();
		 * 
		 * ThreadExample thread2 = new ThreadExample();
		 * thread2.setName("My second thread"); thread2.start();
		 */
		Thread thread1 = new Thread(new RunnableExample());
		thread1.start();

		Thread thread2 = new Thread(() -> {

			int i = 0;
			while (i <= 100) {
				System.out.println(i + " " + Thread.currentThread().getName());
				i++;

			}

		});
		thread2.start();
	}

}
