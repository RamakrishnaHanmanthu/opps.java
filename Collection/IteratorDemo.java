package Collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {

//		List<Integer>list=
//				Arrays.asList(1,2,3,4,5);
//		
//		Iterator <Integer>iterator= 
//				list.iterator();
//		
//		while (iterator.hasNext()) {
//			
//			System.out.println("  :"+iterator.next());
//		}
//		

		List<Integer> list = Arrays.asList(22, 33, 44);
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(" :" + iterator.next());
			System.out.println(" :" + iterator.getClass());
		}

	}

}
