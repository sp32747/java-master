package com.sree.leet3;

public class Power {

	public static void main(String[] args) {
		int pow=-2;
		long power = Math.abs((long)pow);
		int x = 2;
		double result = 1.0;
		while (power != 0) {

			if (power % 2 == 1) {
				result = result * x;
				power = power - 1;
			}

			x = x * x;
			power = power / 2;

		}

		if(pow<0) {
			result=1.0/result;
		}
		
		System.out.println(result);

	}

}
