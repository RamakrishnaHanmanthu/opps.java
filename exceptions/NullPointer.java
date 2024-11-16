package exceptions;

import java.util.Scanner;

public class NullPointer {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter a number :");
		Integer a =sc.nextInt();
		System.out.println("enter a 2nd number :");
		Integer b= sc.nextInt();

//		Integer a= 10;
//		Integer b=null;
//		
		
		
		try {
			System.out.println(" "+a/b);
			
		}catch(NullPointerException n1)
		{
			System.out.println("expection n1 :"+n1);
		}

	}

}
