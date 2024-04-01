package com.sree.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestEecutor1 {

	public static void main(String[] args) {
		
		//defog tech youtube
		//for cpu intensive tasks like block chain use number of cpus as teh thread pool size
		//for IO intensive tasks take a higher thread pool
		//how many cores available in machine
		
		int numberOfCores=Runtime.getRuntime().availableProcessors();
		
		System.out.println(numberOfCores);
		
		//thread pool internally uses blocking queue to store the task to avoid concurrency issue by the threads
		
		ExecutorService service = Executors.newFixedThreadPool(numberOfCores);

		for (int i = 0; i < 10; i++) {
			service.execute(() -> System.out.println(Thread.currentThread().getName()));
		}
		 System.out.println(Thread.currentThread().getName());
	}

}
