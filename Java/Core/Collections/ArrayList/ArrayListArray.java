package com.kodali.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListArray {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		al.add("Java");
		al.add("Spring");
		al.add("Hibernate");
		al.add("REST");
		al.add("SQL");
		// List => array
		String[] array = new String[al.size()];
		al.toArray(array);
		for (String element : array) {
			System.out.println(element);
		}

		// Array => List
		List<String> al1 = new ArrayList<>();
		al1 = Arrays.asList(array);
		System.out.println(al1);
	}

}
