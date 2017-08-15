package com.kodali.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;

public class StreamMain {

	public static void main(String[] args) {
		List<String> bingoNumbers = Arrays.asList("N40", "N36", "B12", "B6", "G53", "G49", "g60", "G50", "I26", "I17",
				"I29", "O71");
		//List<String> numbers = new ArrayList<String>();
		/*
		 * Code Without using stream Here we are adding the string starting with
		 * 'G' to numbers list and sorting them. bingoNumbers.forEach(number ->
		 * { if (number.toUpperCase().startsWith("G")) { numbers.add(number); }
		 * });
		 * 
		 * numbers.sort((s1, s2) -> s1.compareTo(s2)); numbers.forEach(s ->
		 * System.out.println(s));
		 */

		/* Using Stream */
		bingoNumbers.stream().map(String::toUpperCase).filter(s -> s.startsWith("G")).sorted()
				.forEach(System.out::println);

	}

}
