package Thread;

class ThreadTest extends Thread {
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
}

public class Threadexmaple {
	public static void main(String[] args) {
		ThreadTest t1 = new ThreadTest();
		ThreadTest t2 = new ThreadTest();
		t1.start();
		
		t2.start();
	}
}

