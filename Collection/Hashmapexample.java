package Collection;

import java.util.HashMap;

public class Hashmapexample {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm= new HashMap<>();
		
		hm.put(null, null);
		System.out.println(hm);
		
		HashMap<String, Integer> hm1= new HashMap<>();
		
		hm1.putAll(hm1);
		System.out.println(hm1);
		
		

	}

}
