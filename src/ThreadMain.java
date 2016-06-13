
public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadExample runnable = new ThreadExample(); //runnable
		Thread t1 = new Thread(runnable);
	    t1.start();
	}

}
