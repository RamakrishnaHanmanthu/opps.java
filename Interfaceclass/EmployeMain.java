package Interfaceclass;

import java.util.Scanner;

public class EmployeMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Employe contract");
		System.out.println("enter perhour");
		double perhour = sc.nextDouble();
		System.out.println("enter hours");
		double hours = sc.nextDouble();

		Employe1contract emp = new Employe1contract(perhour, hours);
		emp.calcsalary();
		System.out.println("call salary :" + emp.calcsalary());
		System.out.println("call salary :" + emp.calsalaryperannum());
		System.out.println("cal tax for salary :" + emp.caltax());
		System.out.println("cal tax perannum :" + emp.caltaxperannum());
		System.out.println("get class name :"+emp.getClass());
		

		System.out.println("Empoye fixed");

		System.out.println("enter daily wages");
		double dailywages = sc.nextDouble();
		System.out.println("enter noof days");
		double days = sc.nextDouble();

		Employefixed emp1 = new Employefixed(dailywages, days);
		emp1.calcsalary();
		System.out.println("call salary :" + emp1.calcsalary());
		System.out.println("call salary :" + emp1.calsalaryperannum());
		System.out.println("cal tax for salary :" + emp1.caltax());
		System.out.println("cal tax perannum :" + emp1.caltaxperannum());
		System.out.println("get class name :"+emp1.getClass());

		sc.close();
	}

}
