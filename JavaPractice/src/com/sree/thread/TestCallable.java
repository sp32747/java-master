package com.sree.thread;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestCallable {

	public static void main(String[] args) {

		ExecutorService service = Executors.newFixedThreadPool(10);

		Future<Integer> future = service.submit(new Task());

		try {

			// if you call the future.get before the execution time of the task it will
			// return nothing , so do some other unrelated operation and then call the
			// future

			Integer x = future.get(); // its a blocking operation\
			System.out.println(x);			
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class Task implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		return new Random().nextInt();
	}

}