package Collection;

import java.util.HashMap;
import java.util.Map;

public class Mapping {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(01, "one");
		map.put(02, "two");
		map.put(01, "22");
		map.put(03, "king");

		map.remove(02);
		map.remove(01);

		System.out.println("print mapping :" + map);
		
		for (Integer a : map.keySet()) {
			System.out.println(+a);
			
		}

	}

}
