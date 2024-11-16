package Abstract;

public class Contractorbasedemp extends EmploySalary {

	public Contractorbasedemp(String empname, int empid) {
		super(empname, empid);

	}

	private double perdaywages;
	private double workingdays;

	public Contractorbasedemp(String empname, int empid, double perdaywages, double workingdays) {
		super(empname, empid);
		this.setPerdaywages(perdaywages);
		this.setWorkingdays(workingdays);

	}

	public double getPerdaywages() {
		return perdaywages;
	}

	public void setPerdaywages(double perdaywages) {
		this.perdaywages = perdaywages;
	}

	public double getWorkingdays() {
		return workingdays;
	}

	public void setWorkingdays(double workingdays) {
		this.workingdays = workingdays;
	}

	@Override
	public double Salarycalculation() {

		return perdaywages*workingdays;
	}

	

}
