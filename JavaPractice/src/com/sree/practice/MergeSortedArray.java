package com.sree.practice;
import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		int[] num1 = { 1, 2, 3, 0, 0, 0 };

		int[] num2 = { 2, 5, 6 };

		merge(num1, 3, num2,3);

	}

	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
	        //variables to work as pointers
	        int i=m-1; // will point at m-1 index of nums1 array
	        int j=n-1; // will point at n-1 index of nums2 array
	        int k=nums1.length-1; //will point at the last position of the nums1 array

	        // Now traversing the nums2 array
	        while(j>=0){
	            // If element at i index of nums1 > element at j index of nums2
	            // then it is largest among two arrays and will be stored at k position of nums1
	            // using i>=0 to make sure we have elements to compare in nums1 array
	            if(i>=0 && nums1[i]>nums2[j]){
	                nums1[k]=nums1[i];
	                k--; 
	                i--; //updating pointer for further comparisons
	            }else{
	                // element at j index of nums2 array is greater than the element at i index of nums1 array 
	                // or there is no element left to compare with the nums1 array 
	                // and we just have to push the elements of nums2 array in the nums1 array.
	                nums1[k] = nums2[j];
	                k--; 
	                j--; //updating pointer for further comparisons
	            }
	        }
	        
	      System.out.println(Arrays.toString(nums1));
	    }

}
