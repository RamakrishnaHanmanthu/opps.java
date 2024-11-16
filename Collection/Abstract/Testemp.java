package Abstract;

import java.util.Scanner;

public class Testemp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter emp name :");
		String empname = sc.next();
		System.out.println("enter  empid");
		int empid = sc.nextInt();
		System.out.println("perhorwages");
		double perhourwages = sc.nextDouble();
		System.out.println("workingdays");
		double workingdays = sc.nextDouble();
		System.out.println("numberofhours");
		double numberofhours = sc.nextDouble();

		Fulltime emp = new Fulltime(empname, empid, perhourwages, workingdays, numberofhours);
		System.out.println(emp.Salarycalculation());

		System.out.println("enter emp name of con:");
		String empname1 = sc.next();
		System.out.println("enter  empid1");
		int empid1 = sc.nextInt();
		System.out.println("perdaywages1");
		double perdaywages1 = sc.nextDouble();
		System.out.println("workingdays1");
		double workingdays1 = sc.nextDouble();

		Contractorbasedemp emp1 = new Contractorbasedemp(empname1, empid1, perdaywages1, workingdays1);
		System.out.println(emp1.Salarycalculation());

		sc.close();

	}

}
