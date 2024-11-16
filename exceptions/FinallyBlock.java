package exceptions;

public class FinallyBlock {

	
		public static void main(String[] args) {

			int a = 10;
			int b = 0;
			Integer c = null;

			try {
				System.out.println(a / b);
	

			} catch (ArithmeticException e1) {

				System.out.println(e1);
				
			}catch(NullPointerException a1) {
				System.out.println("null pointer :"+a1);
			}
			
			finally {
				System.out.println("finally block");
			}
			System.out.println(10 / 5);
			System.out.println(20 * 30);


	}

}
