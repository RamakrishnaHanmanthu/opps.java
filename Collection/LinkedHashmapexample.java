package Collection;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import javax.management.ValueExp;

public class LinkedHashmapexample {

	public static void main(String[] args) {

//		LinkedHashMap<String, String> hm = new LinkedHashMap<>();
		LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();

//		hm.put("rama", "krishna");
		hm.put("rama", 10);

//		hm.put("rama", "10")
		hm.put("books" , 20);

//		hm.putIfAbsent("10", "20");
		hm.putIfAbsent("10", 20);
//		hm.putLast("hello", "world");
		hm.putLast("hello", 30);
//		System.out.println(hm.replace("Ram", "krishna", "hanmanthu"));
		System.out.println(hm.replace("rama", 10 ,40));
//		hm.replace("Ram", "10");
		hm.replace("notes", 50);

		System.out.println(hm);
		
//		iterate of map when using  using maps we use for .

		for (String a : hm.keySet()) {
			System.out.println("key value "+a);
			System.out.println(hm.get(a));
			System.out.println(hm.getOrDefault(hm, 12 )+300);
//			System.out.println(hm.getOrDefault(hm, a)+200);

		}
		for(Entry<String, Integer> a : hm.entrySet()) {
			
			System.out.println("enter the boy key and values"+a);
			
			
		}

	}

}
