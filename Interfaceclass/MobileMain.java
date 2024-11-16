package Interfaceclass;

import java.util.Scanner;

public class MobileMain {

	public static void main(String[] args) {
		
		
		System.out.println("enter cameras : ");
		Scanner sc= new Scanner(System.in);
		int camera=sc.nextInt();
		
		Mobilephone one = new Mobilephone(camera);
		one.Mobileprice();
		System.out.println("gst for phone : " + one.gst());
		System.out.println(" number of cameras :" + one.camera);
		System.out.println("mobile price :" + one.Mobileprice());
		System.out.println("  :" + one.getClass());
		
		
		one.currentDateandDay();
		one.currentSystemTime();
		
		
		System.out.println("prime numbers :");
		MobileWorld.Primenumbers();
		System.out.println("sum of 10 numbers :");
		MobileWorld.sum();
		
		
		
		
sc.close();
	}

}
