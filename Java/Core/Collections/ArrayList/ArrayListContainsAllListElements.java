package com.kodali.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListContainsAllListElements {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Java");
		al.add("Spring");
		al.add("Hibernate");
		al.add("REST");
		al.add("SQL");
		List<String> list = new ArrayList<>();
		list.add("Hibernate");
		list.add("REST");
		list.add("SQL");
		System.out.println("Do array list contain all the elements in a list: "+al.containsAll(list));

	}

}
