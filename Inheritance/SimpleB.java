package Inheritance;

public class SimpleB extends Simpleinheritance {
	private int carkhmrange;
	private String carfueltype;

	public SimpleB(int carmodel, String carbrand, int carkhmrange, String carfueltype) {
		// TODO Auto-generated constructor stub
		super(carmodel, carbrand);
		this.carfueltype = carfueltype;
		this.carkhmrange = carkhmrange;
	}

	public int getCarkhmrange() {
		return carkhmrange;
	}

	public void setCarkhmrange(int carkhmrange) {
		this.carkhmrange = carkhmrange;
	}

	public String getCarfueltype() {
		return carfueltype;
	}

	public void setCarfueltype(String carfueltype) {
		this.carfueltype = carfueltype;
	}

	public void cardetails() {
		displayCradetails();
		System.out.println("car for khm for range : " + carkhmrange);
		System.out.println("car  fuel type : " + carfueltype);
	}

}
