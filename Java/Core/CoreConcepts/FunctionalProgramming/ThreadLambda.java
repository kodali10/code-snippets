package com.kodali.FunctionalProgramming;

public class ThreadLambda {

	public static void main(String[] args) {
		new Thread(() -> System.out.println("Thread")).start();
	}

}
