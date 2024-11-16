package Interfaceclass;

public class Employefixed implements Employesalary {

	public double dailywages;
	public double days;

	public Employefixed(double dailywages, double days) {
		super();
		this.dailywages = dailywages;
		this.days = days;

	}

	@Override
	public double calcsalary() {

		return dailywages * days;
	}

	@Override
	public double caltax() {

		return caltaxperannum()/12;
	}

	@Override
	public double calsalaryperannum() {

		return calcsalary() * 12;
	}

	@Override
	public double caltaxperannum() {
		

		double salaryperannum=calsalaryperannum();		
		double tax=0;

		if (salaryperannum >= 1000000 ) {
			 tax=salaryperannum * 0.30;
		} else if (salaryperannum >= 750000 ) {
			tax=salaryperannum * 0.25;
		} else if (salaryperannum >= 500000) {
			 tax=salaryperannum * 0.20;

		} else if (salaryperannum >= 250000) {
			tax=salaryperannum * 0.10;
		}

		return tax;

		
	}

	

}
