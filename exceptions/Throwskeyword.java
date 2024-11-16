package exceptions;

public class Throwskeyword {

	int a = 10;
	int b = 0;

	public int division(int a, int b) throws ArithmeticException  {

		int c = a / b;
		int d = a+b;
		int e= c+d;
//		return  c;
//		return d;/
		return e;

	}
	public static void main(String[ ] args) {
		
		Throwskeyword on= new Throwskeyword();
		on.division(6, 2);
		System.out.println(" hii  :"+on.division(6, 2));
		System.out.println(" :"+on.division(55, 100));
		
	}

}
