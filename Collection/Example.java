package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Example {

	public static void main(String[] args) {

		ArrayList<Integer> a1 = new ArrayList<>();

		a1.add(10);
		a1.add(20);
		a1.add(2, 30);
		a1.add(3, 40);
		a1.add(50);

		System.out.println("   print a1 values :" + a1);

		ArrayList<Integer> a2 = new ArrayList<>();

		a2.addAll(a1);

		System.out.println(" print clone :" + a2);

		Iterator<Integer> i = a2.iterator();
		while (i.hasNext()) {
			System.out.println(i.next() + 100);
		}
		a2.set(0, null);

		if (a2.contains(110)) {
			System.out.println("is found");

		}

		ArrayList<Integer> a3 = new ArrayList<>();

		a3.addAll(a2);
		System.out.println(a3);

		a1.removeAll(a1);
		System.out.println(a1);

	}

}
