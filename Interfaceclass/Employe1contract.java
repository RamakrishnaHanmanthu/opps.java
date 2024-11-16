package Interfaceclass;

public class Employe1contract implements Employesalary {

	public double perhour;
	public double hours;

	public Employe1contract(double perhour, double hours) {
		super();
		this.perhour = perhour;
		this.hours = hours;
	}

	@Override
	public double calcsalary() {

		return perhour * hours;
	}

	@Override
	public double caltax() {

		return caltaxperannum() / 12;
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
