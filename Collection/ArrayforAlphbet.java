package Collection;

import java.util.ArrayList;

public class ArrayforAlphbet {

	public static void main(String[] args) {

		String a1[] = {"Ramakrishna"};
//		System.out.println("  " + a1.toUpperCase());
//		System.out.println("  :" + a1.toLowerCase());
		
		int a= a1.length;
		System.out.println("  :"+a);
		
		int count=0;
		for(int i=0;i<=a1.length;i++) {
			
			for (int j=i+1;j<=a1.length-1;j++) {
				if (a1[i]==a1[j]) {
					
					System.out.println(  "fiiii");
					
				}
			}System.out.println();
		}
	
//		ArrayList<String> string1 = new ArrayList<String>();
//		string1.add(a1);
//		string1.addAll(string1);
//		System.out.println("  :" + string1);

	}

}
