package Interfaceclass;

import java.util.Date;

public interface MobileWorld {

	public double Mobileprice();

	public double gst();

	default void currentDateandDay() {

		Date date = new Date();
		System.out.println("get day and date :" + date.getDate());
		System.out.println("get day :" + date.getDay());
		System.out.println("get time :" + date.getHours());
		System.out.println("get minutes :" + date.getMinutes());
		System.out.println("secounds :" + date.getSeconds());
		System.out.println("time :" + date.getTime());
		System.out.println("year :" + date.getYear());

	}

	default void currentSystemTime() {

		Date date = new Date();
		System.out.println("current system time hours: " + date.getHours());
		System.out.println("minutes : " + date.getMinutes());
		System.out.println("secounds :" + date.getSeconds());
		System.out.println("year :" + date.getYear());
		System.out.println("month :" + date.getMonth());
		System.out.println("date :" + date.getDate());
		System.out.println("");
	}

	public static void Primenumbers() {

		for (int i = 2; i <= 100; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	private static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static void sum() {

		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum = sum + i;

			System.out.print("  " + sum);

		}

	}

}
