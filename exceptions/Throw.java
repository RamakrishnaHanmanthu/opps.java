package exceptions;

public class Throw {
	
	public static void main(String[] args) {
//		int a=10;
//		int b = 5;
//		
//		System.out.println(a/b);
		
		int a = 10;
		int b= 0;
		Integer c = null;
		
//		System.out.println(a/b);
		
		try {
			System.out.println(a/b);
			
		}catch(ArithmeticException e1) {
			throw new ArithmeticException("the throw block :"+e1);
			
		}finally {
			System.out.println("kingdom");
		}
		
	}

	
	
	
	
	
	
	
	

}
