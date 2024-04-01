package com.sree.practice;

public class TestArray {
public static void main(String[] args) {
	int[] num1= {1,5,7,8,9,0,0,0};
	int k=num1.length;
	
	for(int i=0;i<2;i++) {
		num1[k]=i;
		k++;
		
				}
	
	System.out.println(num1);
}
}
