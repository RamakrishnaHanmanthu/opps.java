package SortCollection;

public class EmployeSalaryComparator implements Comparable<EmployeSalaryComparator> {

	public Double Salary;
	public String name;

	public EmployeSalaryComparator(Double salary, String name) {
		super();
		this.Salary = salary;
		this.name = name;
	}

	public Double getSalary() {
		return Salary;
	}

	public void setSalary(Double salary) {
		Salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	@Override
//	public int compareTo(EmployeSalaryComparator o) {
//
//		return this.Salary.compareTo(o.Salary);
//	}

	public int compareTo(EmployeSalaryComparator o) {

		return this.name.compareTo(o.name);
	}
	@Override
	public String toString() {
		return "EmployeSalaryComparator [Salary=" + Salary + ", name=" + name + "]";
	}

}
