package Inheritance;

public class InheritanceBike {
	private String bikemodel;
	private String brand;

	public InheritanceBike(String bikemodel, String brand) {
		super();
		this.bikemodel = bikemodel;
		this.brand = brand;

	}

	public String getBikemodel() {
		return bikemodel;
	}

	public void setBikemodel(String bikemodel) {
		this.bikemodel = bikemodel;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void displayBikeDetails() {
		System.out.println("Brand : " + brand);
		System.out.println("Model : " + bikemodel);


	}

}
