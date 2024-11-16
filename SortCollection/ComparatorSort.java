package SortCollection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorSort {

	public static void main(String[] args) {
		List<EmployeSalaryComparator> ex = new ArrayList<>();
		ex.add(new EmployeSalaryComparator(2500.0, "rama"));
		ex.add(new EmployeSalaryComparator(3300.00, "hello"));
		ex.add(new EmployeSalaryComparator(28220.3,"tg"));

//		sort by salary

//		ex.sort(null);

		ex.sort(new Comparator<EmployeSalaryComparator>() {

			@Override
			public int compare(EmployeSalaryComparator a1, EmployeSalaryComparator a2) {

				return a1.getName().compareTo(a2.getName());
			}
		});
		for (EmployeSalaryComparator b : ex) {
			System.out.println(b);

		}

//		sort by lambda

		ex.sort(Comparator.comparing(EmployeSalaryComparator::getName));
		System.out.println("with lambda");
		for (EmployeSalaryComparator c : ex) {
			System.out.println(c);
		}
		ex.sort(Comparator.comparing(EmployeSalaryComparator::getName).reversed());
		System.out.println("with lambda");
		for (EmployeSalaryComparator c : ex) {
			System.out.println(c);
		}
		ex.sort(Comparator.comparing(EmployeSalaryComparator::getSalary));
		System.out.println("with lambda");
		for (EmployeSalaryComparator c : ex) {
			System.out.println(c);
		}
		ex.sort(Comparator.comparing(EmployeSalaryComparator::getSalary).reversed());
		System.out.println("with lambda");
		for (EmployeSalaryComparator c : ex) {
			System.out.println(c);
		}
	}

}
