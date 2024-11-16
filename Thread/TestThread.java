package Thread;

public class TestThread extends Thread {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread: " + i);
			try {
				Thread.sleep(1000); // Sleep for 1 second
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {
		ThreadTest t1 = new ThreadTest();
	

	}

}
