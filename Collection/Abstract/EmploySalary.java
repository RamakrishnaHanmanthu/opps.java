package Abstract;

public abstract class EmploySalary {

	private String empname;
	private int empid;

	public EmploySalary(String empname, int empid) {
		super();
		this.setEmpname(empname);
		this.setEmpid(empid);

	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public abstract double Salarycalculation();
	
	

}
