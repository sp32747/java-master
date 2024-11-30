package com.sree.thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.swing.tree.FixedHeightLayoutCache;

public class CompletableFutureTest {

	public static void main(String[] args) {
		ExecutorService service=Executors.newFixedThreadPool(10);
		
		
		
		
		
		
		for(int i=0;i<10;i++) {
		
		service.execute(()->System.out.println(Thread.currentThread().getName()));
		
	}}

}
