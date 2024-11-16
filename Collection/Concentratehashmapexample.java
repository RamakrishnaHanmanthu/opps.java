package Collection;

import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class Concentratehashmapexample {

	public static void main(String[] args) {

		ConcurrentHashMap<String, Integer> a = new ConcurrentHashMap<>();
		
		a.put("pen", 2);
		a.put("hellow", 55);
		a.put("pen", 33);
		

		for (String i : a.keySet()) {
			System.out.println("key value "+a);
			System.out.println(a.get(a));
			System.out.println(a.getOrDefault(i, 12 )+300);
//			System.out.println(hm.getOrDefault(hm, a)+200);

		}
		for(Entry<String, Integer> i : a.entrySet()) {
			
			System.out.println("enter the boy key and values"+a);
			
			
		}
		

	}

}
