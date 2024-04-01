package com.sree.practice;

import java.util.HashMap;
import java.util.Map;

public class ConcurrentHashMapTest extends Thread {

	static Map<Integer, String> hashMap = new HashMap();
	
	
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			hashMap.put(4, "D");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}

	public static void main(String[] args) throws InterruptedException {

		hashMap.put(1, "A");
		hashMap.put(2, "B");
		hashMap.put(3, "C");

		ConcurrentHashMapTest thread=new ConcurrentHashMapTest();
		thread.start();
		
		for(Object o:hashMap.entrySet()) {
			
			System.out.println(o);
			Thread.sleep(1000);
			
		}
		
		System.out.println(hashMap);
		
	}

}
