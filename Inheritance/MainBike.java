package Inheritance;

public class MainBike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InheritanceBike bike = new InheritanceBike("Bajaj", "KTM");
		System.out.println("print bike ");
		bike.displayBikeDetails();
		System.out.println();

		ElectricBike biElectricBike = new ElectricBike("Bajaj", "Honda", 5000, 60);
		System.out.println("print model : " + bike.getBikemodel());
		System.out.println("print model : " + bike.getBrand());
		System.out.println("print classname" + biElectricBike.getClass());
		System.out.println("print range" + biElectricBike.getRange());
		System.out.println("print battery " + biElectricBike.getBattery());

		biElectricBike.displayDetails();
		System.out.println();

		Enginebike enginebike = new Enginebike("Bajaj", "pulsar", "petrol", 150);
		System.out.println("print enginebike ");

		enginebike.displayBike();
		bike.displayBikeDetails();

	}

}
