package com.sree.practice;
import java.util.Arrays;

public class RemoveDuplmax2 {
	
	
public static void main(String[] args) {
	
	int arr[]={5,5,5,5,6,6,7,7,7,7};
	removeDuplicates(arr);
	
	
	
}



public static int removeDuplicates(int[] nums) {
    int i = 0;
    for (int n : nums)
        if (i < 2 || n > nums[i-2])
            nums[i++] = n;
   
    System.out.println(Arrays.toString(nums));
    return i;
    
  
}}
