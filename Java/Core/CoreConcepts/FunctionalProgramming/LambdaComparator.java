package com.kodali.FunctionalProgramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee {
	private String name;

	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class LambdaComparator {

	public static void main(String[] args) {
		Employee john = new Employee("john curtis");
		Employee mark = new Employee("steve mark");
		Employee avan = new Employee("avan seth");
		Employee jeanne = new Employee("jeanne Boyarsky");
		Employee scott = new Employee("scott selikoff");
		List<Employee> list = new ArrayList<>();
		list.add(john);
		list.add(mark);
		list.add(avan);
		list.add(jeanne);
		list.add(scott);
		/*
		 * Collections.sort(list, new Comparator<Employee>() {
		 * 
		 * @Override public int compare(Employee emp1, Employee emp2) { return
		 * emp1.getName().compareTo(emp2.getName()); } });
		 */
		Collections.sort(list, (emp1, emp2) -> emp1.getName().compareTo(emp2.getName()));

		for (Employee employee : list) {
			System.out.println(employee.getName());
		}
	}

}
