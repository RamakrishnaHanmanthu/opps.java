package Abstract;

public class UdipiHotel extends Streetfood {

	public UdipiHotel(String companyname, String location) {
		super(companyname, location);

	}

	private double costperiteam;

	private int numberofiteams;

	public UdipiHotel(String companyname, String location, double costperiteam, int numberofiteams) {
		super(companyname, location);
		this.costperiteam=costperiteam;
		this.numberofiteams=numberofiteams;

	}

	public double getCostperiteam() {
		return costperiteam;
	}

	public void setCostperiteam(double costperiteam) {
		this.costperiteam = costperiteam;
	}

	public int getNumberofiteams() {
		return numberofiteams;
	}

	public void setNumberofiteams(int numberofiteams) {
		this.numberofiteams = numberofiteams;
	}

	@Override
	public double gstcalc() {
		
		return totalbill()*0.12;
	}

	@Override
	public double totalbill() {
		
		return numberofiteams*costperiteam;
 	}

}
