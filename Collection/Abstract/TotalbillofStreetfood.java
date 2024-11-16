package Abstract;

import java.util.Scanner;

public class TotalbillofStreetfood {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter companyname  kfc:");
		String companyname = sc.next();
		System.out.println("enter location :");
		String location = sc.next();
		System.out.println("number of iteams: ");
		int numberofiteams = sc.nextInt();
		System.out.println("costperiteam :");
		double costperiteam = sc.nextDouble();

		Kfc food = new Kfc(companyname, location, costperiteam, numberofiteams);
		System.out.println("gst for total bill :" + food.gstcalc());
		System.out.println("total bill :" + food.totalbill());

		System.out.println("enter companyname udipihotel :");
		String companyname1 = sc.next();
		System.out.println("enter location :");
		String location1 = sc.next();
		System.out.println("number of iteams: ");
		int numberofiteams1 = sc.nextInt();
		System.out.println("costperiteam :");
		double costperiteam1 = sc.nextDouble();

		UdipiHotel food1 = new UdipiHotel(companyname1, location1, costperiteam1, numberofiteams1);
		System.out.println("gst for total bill :" + food1.gstcalc());
		System.out.println("total bill :" + food1.totalbill());

		System.out.println("enter companyname Starbucks :");
		String companyname2 = sc.next();
		System.out.println("enter location :");
		String location2 = sc.next();
		System.out.println("number of iteams: ");
		int numberofiteams2 = sc.nextInt();
		System.out.println("costperiteam :");
		double costperiteam2 = sc.nextDouble();

		Starbucks food2 = new Starbucks(companyname2, location2, costperiteam2, numberofiteams2);
		System.out.println("gst for total bill :" + food2.gstcalc());
		System.out.println("total bill :" + food2.totalbill());

		sc.close();
	}

}
