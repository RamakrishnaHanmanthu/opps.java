package Abstract;

public abstract class Streetfood {

	private String companyname;
	private String location;

	public Streetfood(String companyname, String location) {
		super();

	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public abstract double totalbill();

	public abstract double gstcalc();

}
