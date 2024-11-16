package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {
	public static void main(String[] args) {

		List<String> a = Arrays.asList("26", "63", "44");

		List<String> findvalue = a.stream()
				.filter(test -> test.endsWith("6"))
				.collect(Collectors.toList());
		
		
		System.out.println(findvalue);

	}

}