package com.kodali.FunctionalProgramming;

import java.util.Random;
import java.util.function.IntPredicate;
import java.util.function.Supplier;

public class PredicateSuppliers {
	public static void main(String[] args) {

		/* Random number generator without lambda */
		/*
		 * Random random = new Random(); int r = (random.nextInt(100) - 33);
		 */
		Random random = new Random();
		Supplier<Integer> randomSuplier = () -> (random.nextInt(100) - 33);
		int r = randomSuplier.get();
		System.out.println("Random Number: " + r);
		/* IntPredicate */
		IntPredicate greaterThan15, lessThan100;
		greaterThan15 = i -> i > 15;
		lessThan100 = i -> i < 100;
		Boolean b;
		b = greaterThan15.and(lessThan100).test(r);
		if (b) {
			System.out.println("The number is in between 15 and 100");
		} else {
			System.out.println("The number is not inbetween 15 and 100");
		}

	}
}
