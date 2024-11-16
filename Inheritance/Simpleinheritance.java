package Inheritance;

public class Simpleinheritance {

	private int carmodel;
	private String carbrand;

	public Simpleinheritance(int carmodel, String carbrand) {
		// TODO Auto-generated constructor stub
		super();
		this.carbrand = carbrand;
		this.carmodel = carmodel;
	}

	public int getCarmodel() {
		return carmodel;
	}

	public void setCarmodel(int carmodel) {
		this.carmodel = carmodel;
	}

	public String getCarbrand() {
		return carbrand;
	}

	public void setCarbrand(String carbrand) {
		this.carbrand = carbrand;
	}

	public void displayCradetails() {

		System.out.println("carmodel : " + carmodel);
		System.out.println("carbrand : " + carbrand);

	}

}
