package Streams;

import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

public class ExampleofStreams {

	public static void main(String[] args) {

		List<String> b = Arrays.asList("saivineeth", "2", "3", "4", "5", "6", "7");

		List<String> findlength = b.stream() // length of the string calls each string one by one ..

				.filter(test -> test.length() < 5)
				.collect(Collectors.toList());
		System.out.println(findlength);
	}

}
