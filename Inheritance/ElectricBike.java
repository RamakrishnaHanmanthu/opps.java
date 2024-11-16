package Inheritance;

public class ElectricBike extends InheritanceBike {
	private int battery;
	private int range;

	public ElectricBike(String bikemodel, String brand, int battery, int range) {
		super(bikemodel, brand);
		this.battery = battery;
		this.range = range;

	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public void displayDetails() {
		displayBikeDetails();
		System.out.println("battery :" + battery);
		System.out.println("range : " + range);
		

	}

}
