package Methodoverriding;

import java.util.Scanner;

public class MainClassoverriding {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the firstname");
		String firstname = sc.next();

		System.out.println("Enet the lastname");
		String lastname = sc.next();

		System.out.println("Enter the age");
		int age = sc.nextInt();

		Class d = new Class(firstname, lastname, age);
		System.out.println(" : " + d.calClass());
		System.out.println("");

		System.out.println("Enter male or female");
		String gender = sc.next();

		Classb b = new Classb(firstname, lastname, age, gender);
		System.out.println(" : " + b.calClass());

		sc.close();

	}

}
