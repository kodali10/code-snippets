package com.kodali.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class AddListToArrayList {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Java");
		al.add("Spring");
		al.add("Hibernate");
		al.add("REST");
		al.add("SQL");
		List<String> list = new ArrayList<>();
		list.add("spring-boot");
		list.add("gradle");
		al.addAll(list);
		System.out.println(al);

		// clear all elements in array list
		al.clear();
		System.out.println(al);
	}

}
