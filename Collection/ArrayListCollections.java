package Collection;

import java.util.ArrayList;

public class ArrayListCollections {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("name");
		list.add("haii");
		list.remove(1);
		System.out.println("  :" + list.get(0));
		System.out.println("  :" + list.getLast());

		System.out.println(" print list :" + list);

//		/contains or finding.
		if (list.contains(list)) {
			System.out.println("  ");

		}
		
		
		
		list.indexOf(list);
		System.out.println(list.isEmpty());

	}

}