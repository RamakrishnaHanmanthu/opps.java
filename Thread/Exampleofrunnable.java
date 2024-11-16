package Thread;

class MyRunnable implements Runnable {
	 public void run() {
	 System.out.println("MyRunnable is running");
	
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
	
	public class Exampleofrunnable {
	 public static void main(String[] args) {
	 Thread thread = new Thread(new MyRunnable());
	 thread.start();
	 }
	}

