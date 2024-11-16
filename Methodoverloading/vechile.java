package Methodoverloading; //compile time polymorphism.

public class vechile {

//	static int bike;
//	static int auto;
//	static int car;
//	static int lorry;

	public static String findvechile(int a, int b) {
		return "bike";

	}
//	public static int findvechile(int a, int b, int c) {
//		return auto;
//	}
//	public static int findvechile(int a, int b, int c, int d) {
//		return car;
//	}
//	public static int findvechile(int a, int b, int c, int d, int e) {
//		return lorry;
//	}
	
	public static void main(String[] args) {
		
		System.out.println(findvechile(1, 2));
		
//		System.out.println("auto : "+findvechile(1, 2, 3));
//		System.out.println("car : "+findvechile(1,1,1,1));
//		System.out.println("lorry : "+findvechile(0, 0, 0, 0, 0));
		
	}

}
