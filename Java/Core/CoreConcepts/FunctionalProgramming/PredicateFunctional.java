package com.kodali.FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Employee2 {
	private String name;
	private int age;

	public Employee2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

public class PredicateFunctional {

	public static void main(String[] args) {

		Employee2 john = new Employee2("John Doe", 30);
		Employee2 tim = new Employee2("Tim Buchalka", 21);
		Employee2 jack = new Employee2("Jack Hill", 40);
		Employee2 snow = new Employee2("Snow White", 22);
		Employee2 red = new Employee2("Red RidingHood", 35);
		Employee2 charming = new Employee2("Prince Charming", 31);

		List<Employee2> employees = new ArrayList<>();
		employees.add(john);
		employees.add(tim);
		employees.add(jack);
		employees.add(snow);
		employees.add(red);
		employees.add(charming);
		/*
		 * Here we passed consumer functional interface into forEach method. We
		 * are repeating the code for getting the list under and over age.
		 * System.out.println("Employee greater than 30");
		 * System.out.println("************************"); employees.forEach(emp
		 * -> { if (emp.getAge() > 30) { System.out.println(emp.getName() +
		 * " - " + emp.getAge()); } });
		 * System.out.println("************************");
		 * System.out.println("Employee younger than 30");
		 * System.out.println("************************"); employees.forEach(emp
		 * -> { if (emp.getAge() < 30) { System.out.println(emp.getName() +
		 * " - " + emp.getAge()); } });
		 */
		printEmployeesByAge(employees, "Employee age is greater than 30", e -> e.getAge() > 30);
		printEmployeesByAge(employees, "Employee age is less than 30", e -> e.getAge() < 30);
	}

	private static void printEmployeesByAge(List<Employee2> employees, String ageText,
			Predicate<Employee2> ageCondition) {
		System.out.println(ageText);
		System.out.println("*****************");
		for (Employee2 emp : employees) {
			if (ageCondition.test(emp)) {
				System.out.println(emp.getName() + " - " + emp.getAge());
			}
		}

	}
}
