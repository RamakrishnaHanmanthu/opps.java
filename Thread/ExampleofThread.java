package Thread;

class Mythread extends Thread {

	public void run() {

		System.out.println("Thread running : " + Thread.currentThread().getName());
		System.out.println("Thread running : " + Thread.currentThread().getId());
	}

}

public class ExampleofThread{
	
	public static void main(String[] args) {
		
		Mythread a= new Mythread();
		a.getName();
		System.out.println(a.getName());
		System.out.println(a.getClass());
		
		
		
	}
	
	
	
	
}