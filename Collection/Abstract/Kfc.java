package Abstract;

public class Kfc extends Streetfood {

	public Kfc(String companyname, String location) {
		super(companyname, location);
		// TODO Auto-generated constructor stub
	}

	private double costperiteam;

	private int numberofiteams;

	public Kfc(String companyname, String location, double costperiteam, int numberofiteams) {
		super(companyname, location);
		this.costperiteam = costperiteam;
		this.numberofiteams = numberofiteams;
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
		
		return (numberofiteams*costperiteam)*0.24;
	}

	@Override
	public double totalbill() {
		
		return numberofiteams*costperiteam;
	}

}