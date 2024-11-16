package Interfaceclass;

import java.util.Scanner;

public class ApartementMain {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter noof sqfts");
		int totalnoofSqfts=sc.nextInt();
		System.out.println("enter sqftsperFlat");
		int sqftsperFlat=sc.nextInt();
		System.out.println("enter numberofRoomsPerFlat");
		int numberofRoomsPerFlat=sc.nextInt();
		System.out.println("enter numberofWindowsPerFlat");
		int  numberofWindowsPerFlat=sc.nextInt();
		System.out.println("enter costperFlat");
		int costperFlat=sc.nextInt();
		System.out.println("enter noofFloors");
		int noofFloors=sc.nextInt();
		
	
		Flat1 flat=new Flat1(totalnoofSqfts, sqftsperFlat, numberofRoomsPerFlat, numberofWindowsPerFlat, costperFlat, noofFloors);
		System.out.println("flats numberofFlats :"+flat.numberofFlats());
		System.out.println("cost per flat :"+flat.costperFlat);
		System.out.println("no of floors :"+flat.noofFloors);
		System.out.println("no of rooms :"+flat.numberofRooms());
		System.out.println("noof windows :"+flat.numberofWindows());
		System.out.println(flat.noofFloors);
		
		
		sc.close();	
	}

}
