package Thread;

public class ThreadRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("ThreadRunnable :" + Thread.currentThread().getName());
		System.out.println("ThreadRunnable :" + Thread.currentThread().getClass());

	}

	public static void main(String[] args) {
		ThreadRunnable runnable = new ThreadRunnable();
		Thread th = new Thread(runnable);
		th.getClass();
		th.run();
		
	}

}
