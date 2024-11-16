package Abstract;

public class Starbucks extends Streetfood {

	public Starbucks(String companyname, String location) {
		super(companyname, location);
		// TODO Auto-generated constructor stub
	}
	
	private double costperiteam;
	private int numberofiteams;
	
	public Starbucks(String companyname, String location, double costperiteams, int numberofiteams) {
		super(companyname, location);
		this.costperiteam=costperiteams;
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
		
		return totalbill()*0.18;
	}

	@Override
	public double totalbill() {
		
		return numberofiteams*costperiteam;
	}

	

}
