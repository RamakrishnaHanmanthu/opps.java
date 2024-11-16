package exceptions;

public class UnCheckedExpections {

	public static void main(String[] args) {
//		int a=10;
//		int b = 5;
//		
//		System.out.println(a/b);
		
		int a = 10;
		int b= 0;
		
//		System.out.println(a/b);
		
		try {
			System.out.println(a/b);
			
		}catch(ArithmeticException e1) {
			System.out.println(e1);
			
		}

	}

}
