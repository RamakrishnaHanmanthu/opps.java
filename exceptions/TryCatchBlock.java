package exceptions;

public class TryCatchBlock {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;
		Integer c = null;

		try {
			System.out.println(a / b);

		} catch (Exception e1) {

			System.out.println(e1);
		}
		System.out.println(10 / 5);
		System.out.println(20 * 30);

		try {
			System.out.println(60 / 30);
			System.out.println(c /b );
		} catch (NullPointerException e) {
			System.out.println("  :" + e);
		} catch (ArithmeticException f) {

			System.out.println(" :" + f);
		}

	}
}
