package com.kodali.ArrayList;

import java.util.ArrayList;

public class BasicArrayList {
	private static int i = 1;

	public static void main(String[] args) {
		// Basic array list and methods
		ArrayList<String> al = new ArrayList<>();
		al.add("Java");
		al.add("Spring");
		al.add("Hibernate");
		al.add("REST");
		al.add("SQL");
		System.out.println("Array List		  : " + al);
		System.out.println("Element at index 1: " + al.get(1));
		System.out.println("Index of Hibernate: " + al.indexOf("Hibernate"));
		System.out.println("Array list is empty:" + al.isEmpty());
		System.out.println("List contains REST:" + al.contains("REST"));
		al.add(3, "Maven");
		System.out.println("Array List		  :" + al);
		System.out.println("						");

		// Iterate over array list
		System.out.println("Elements in Array List");
		System.out.println("======================");
		for (String element : al) {

			System.out.println("Element " + i + ": " + element);
			i++;
		}
	}

}
