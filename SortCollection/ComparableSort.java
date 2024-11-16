package SortCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableSort {

	public static void main(String[] args) {
		List<EmployeSalaryComparator> ex = new ArrayList<>();
		ex.add(new EmployeSalaryComparator(2500.0, "rama"));
		ex.add(new EmployeSalaryComparator(3300.00, "hello"));

		Collections.sort(ex);
		for (EmployeSalaryComparator a : ex) {
			System.out.println(a);
		}

	}

}
