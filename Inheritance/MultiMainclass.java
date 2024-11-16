package Inheritance;

import java.util.Scanner;

public class MultiMainclass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter name of animal");
		String Animal = sc.next();

		System.out.println("Enter name of bread");
		String Bread = sc.next();

		System.out.println("Enter name of food");
		String food = sc.next();

		System.out.println("Enter range");
		String range = sc.next();

		System.out.println("Enter animal eat");
		String veg = sc.next();

		Multi3 kill = new Multi3(Animal, Bread, food, range, veg);
		System.out.println(" :" + kill.kill(Animal, Bread, food, range, veg));

		System.out.println(" :" + kill.getAnimal());
		System.out.println(" :" + kill.getClass());

		sc.close();

	}

}
