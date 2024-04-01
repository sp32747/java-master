package com.sree.leet;

public class FlowerBed {

	public static void main(String[] args) {
		int numPlant = 2;
		int[] plotFlower = { 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0 };
		int count = 0;

		for (int i = 0; i < plotFlower.length; i++) {
			if (plotFlower[i] == 0) {
				boolean emptyLeft = (i - 1 < 0 || plotFlower[i - 1] == 0);

				boolean emptyRight = (i + 1 >= plotFlower.length || plotFlower[i + 1] == 0);

				if (emptyLeft && emptyRight) {
					plotFlower[i] = 1;
					count++;
				}

			}
		}
		System.out.println(count >= numPlant);
	}

}
