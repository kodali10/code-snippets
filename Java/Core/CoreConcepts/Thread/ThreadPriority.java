package com.kodali.Thread;

public class ThreadPriority {

	public static void main(String[] args) {
		
		Thread.currentThread().setPriority(5);
		Thread t = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Thread execution " + i);
			}
		});
		t.setPriority(5);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread execution " + i);
		}

	}

}
