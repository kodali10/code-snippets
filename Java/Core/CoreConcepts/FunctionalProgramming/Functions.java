package com.kodali.FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Employee3 {
	private String name;
	private int age;

	public Employee3(String name, int age) {
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

public class Functions {
	public static void main(String[] args) {
		Employee3 john = new Employee3("John Doe", 30);
		Employee3 tim = new Employee3("Tim Buchalka", 21);
		Employee3 jack = new Employee3("Jack Hill", 40);
		Employee3 snow = new Employee3("Snow White", 22);
		Employee3 red = new Employee3("Red RidingHood", 35);
		Employee3 charming = new Employee3("Prince Charming", 31);

		List<Employee3> employees = new ArrayList<Employee3>();
		employees.add(john);
		employees.add(tim);
		employees.add(jack);
		employees.add(snow);
		employees.add(red);
		employees.add(charming);

		/*
		 * we can pass code that accepts and return a value to method in the
		 * form of a lambda expression. We can run that code without having to
		 * create an interface and a class that implements interface
		 */
		Function<Employee3, String> getLastName = (Employee3 employee) -> {
			return employee.getName().substring(employee.getName().indexOf(' ') + 1);
		};
		String lastName = getLastName.apply(employees.get(0));
		System.out.println(lastName);
		
		
	}
}
