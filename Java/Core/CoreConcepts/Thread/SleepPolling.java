package com.kodali.Thread;

public class SleepPolling {
	private static int counter = 0;

	public static void main(String[] args) throws InterruptedException {

		new Thread(() -> {
			for (int i = 0; i < 200; i++) {
				SleepPolling.counter++;
			}
		}).start();

		while (SleepPolling.counter < 100) {
			System.out.println(counter);
			System.out.println("Count unreached");
			Thread.sleep(1000);
			// Here we have sleep for main thread because it has to wait for
			// created thread to complete
			//
		}
		System.out.println("Count reached to 100!");
	}

}
