package com.kodali.FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;

class Employee1 {
	private String name;
	private int age;

	public Employee1(String name, int age) {
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

public class ConsumerFunctional {

	public static void main(String[] args) {
		Employee1 john = new Employee1("John Doe", 30);
		Employee1 tim = new Employee1("Tim Buchalka", 21);
		Employee1 jack = new Employee1("Jack Hill", 40);
		Employee1 snow = new Employee1("Snow White", 22);
		Employee1 red = new Employee1("Red RidingHood", 35);
		Employee1 charming = new Employee1("Prince Charming", 31);

		List<Employee1> employees = new ArrayList<>();
		employees.add(john);
		employees.add(tim);
		employees.add(jack);
		employees.add(snow);
		employees.add(red);
		employees.add(charming);
		/*
		 * Without using lambda. Return an object for every iteration from a
		 * list
		 * 
		 * for (Employee1 emp : employees) { System.out.println(emp.getName());
		 * System.out.println(emp.getAge()); };
		 */

		/*
		 * Using Lambda
		 * 
		 * Calling forEach method, which expects consumer functional interface
		 * as an argument. consumer Functional Interface expects a single
		 * argument. This can used instead of enhanced for loop for iterating
		 * through list or something else.
		 * https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html
		 */
		employees.forEach(employee -> {
			System.out.println(employee.getName());
			System.out.println(employee.getAge());
		});

	}

}
