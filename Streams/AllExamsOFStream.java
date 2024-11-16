package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AllExamsOFStream {

	public static void main(String[] args) {

		List<String> testnames = Arrays.asList("22", "33", "ramakrishna", "krishna", "66");

		boolean testings = testnames.stream().allMatch(n -> n.startsWith("r"));
		System.out.println("the first" + testings);

		boolean testingAny = testnames.stream().anyMatch(n -> n.contains("22"));
		System.out.println("secound " + testingAny);

		long count = testnames.stream().count();
		System.out.println(count);

		long countwithoutstreams = testnames.size();
		System.out.println(countwithoutstreams);

		List<String> distinctNames = testnames.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctNames);

		Stream<String> check = Stream.empty();

		System.out.println(check.count());

		Optional<String> findAny = testnames.stream().findAny();

		findAny.ifPresent(n -> System.out.println(n));

		Optional<String> firstFirst = testnames.stream().findFirst();
		findAny.ifPresent(n -> System.out.println(n));

	}

}
