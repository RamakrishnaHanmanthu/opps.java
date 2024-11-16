package Inheritance;

public class SimpleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Simpleinheritance car = new Simpleinheritance(2016, "swift");
		System.out.println("print car : ");
		car.displayCradetails();
		System.out.println();

		SimpleB carB = new SimpleB(2016, "swift", 150, "petrol");
		System.out.println("print car details : ");
		carB.cardetails();
		System.out.println();

	}

}
