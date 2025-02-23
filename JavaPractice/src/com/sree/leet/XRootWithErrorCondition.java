package com.sree.leet;

public class XRootWithErrorCondition {

	public static void main(String[] args) {

		double num = 27.0;
		int root = 3;
		double error = .001;
		double ans = rootOfNum(num, root, error);

		System.out.println(ans);

	}

	private static double rootOfNum(double num, int root, double error) {
		double left = 1.0;
		double right = num;

		while ((right - left) > error) {
			double mid = (left + right) / 2.0;

			if (multilply(mid, root) > num) {
				right = mid;
			}

			else {

				left = mid;

			}

		}

		return left;
	}

	private static double multilply(double mid, int root) {
		double resMul = 1.0;
		for (int i = 0; i < root; i++) {
			resMul *= mid;
		}
		return resMul;
	}

}
