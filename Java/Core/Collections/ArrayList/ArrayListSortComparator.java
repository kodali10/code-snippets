package com.kodali.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListSortComparator {

	public static void main(String[] args) {
		List<Empl> list = new ArrayList<Empl>();
		list.add(new Empl("Ram", 3000));
		list.add(new Empl("John", 6000));
		list.add(new Empl("Crish", 2000));
		list.add(new Empl("Tom", 2400));
		//If we want to sort name 
		//Collections.sort(list,(empl1,empl2)-> empl1.getName.compareTo(empl2.getName()));
		Collections.sort(list, new Comparator<Empl>() {

			@Override
			public int compare(Empl o1, Empl o2) {
				if(o1.getSalary() < o2.getSalary() ){
					return 1;
				}
				return -1;
			}
		});
		
		for(Empl element : list){
			System.out.println(element);
		}

	}

}

class Empl {

	private String name;
	private int salary;

	public Empl(String n, int s) {
		this.name = n;
		this.salary = s;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String toString() {
		return "Name: " + this.name + "-- Salary: " + this.salary;
	}
}