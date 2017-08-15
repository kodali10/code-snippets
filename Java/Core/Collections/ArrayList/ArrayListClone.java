package com.kodali.ArrayList;

import java.util.ArrayList;

public class ArrayListClone {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("Java");
		al1.add("Spring");
		ArrayList<String> al2 = (ArrayList<String>) al1.clone();
		System.out.println(al1);
		System.out.println(al2);
	}

}
