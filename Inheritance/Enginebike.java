package Inheritance;

public class Enginebike extends InheritanceBike {
	private String fueltype;
	private int enginemodel;

	public Enginebike(String bikemodel, String brand, String fueltype, int enginemodel) {
		super(bikemodel, brand);
		this.setEnginemodel(enginemodel);
		this.setFueltype(fueltype);

	}

	public String getFueltype() {
		return fueltype;
	}

	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}

	public int getEnginemodel() {
		return enginemodel;
	}

	public void setEnginemodel(int enginemodel) {
		this.enginemodel = enginemodel;
	}

	public void displayBike() {
		displayBikeDetails();
		System.out.println("enginemodel :" + enginemodel);
		System.out.println("fueltype :" + fueltype);


	}

}
