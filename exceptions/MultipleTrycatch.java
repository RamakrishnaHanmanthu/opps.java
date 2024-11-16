package exceptions;

public class MultipleTrycatch {
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
			System.out.println(c / 30);
		} catch (NullPointerException e) {
			System.out.println("  :" + e);
		}
	}

}
