package Abstract;

public class Fulltime extends EmploySalary {

	public Fulltime(String empname, int empid) {
		super(empname, empid);

	}

	private double perhourwages;
	private double workingdays;
	private double numberofhours;

	public Fulltime(String empname, int empid, double perhourwages, double workingdays, double numberofhours) {
		super(empname, empid);
		this.setPerhourwages(perhourwages);
		this.setNumberofhours(numberofhours);
		this.setWorkingdays(workingdays);
	}

	public double getPerhourwages() {
		return perhourwages;
	}

	public void setPerhourwages(double perhourwages) {
		this.perhourwages = perhourwages;
	}

	public double getWorkingdays() {
		return workingdays;
	}

	public void setWorkingdays(double workingdays) {
		this.workingdays = workingdays;
	}

	public double getNumberofhours() {
		return numberofhours;
	}

	public void setNumberofhours(double numberofhours) {
		this.numberofhours = numberofhours;
	}

	@Override
	public double Salarycalculation() {
		
		return perhourwages*workingdays*numberofhours;
	}

	

}
