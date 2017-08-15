package com.kodali.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExec {
	public static void main(String[] args) {
		ExecutorService service = null;

		try {
			service = Executors.newSingleThreadExecutor();
			System.out.println("Begin of thread");
			service.execute(()->System.out.println("Printing some text"));
			service.execute(()->{
				for(int i=0;i<4;i++)
					System.out.println("Printing record: "+i);
				});
			service.execute(()->System.out.println("Printing some text"));
			System.out.println("End");
		} finally {
			if(service !=null) service.shutdown();
		}
	}
}
