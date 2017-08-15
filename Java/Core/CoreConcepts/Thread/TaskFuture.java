package com.kodali.Thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class TaskFuture {
	private static int counter = 0;

	public static void main(String[] args) throws InterruptedException, ExecutionException  {
		ExecutorService service = null;

		try {
			service = Executors.newSingleThreadExecutor();
			Future<?> result = service.submit(()->{
				for(int i=0; i<500; i++){
					counter++;
				}
			});
			result.get(10, TimeUnit.SECONDS);
		} catch (TimeoutException e) {
			System.out.println("Not reached in time");
		}finally {
			if(service != null) service.shutdown();
		}
	}

}
