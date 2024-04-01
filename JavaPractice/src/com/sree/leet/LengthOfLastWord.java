package com.sree.leet;

public class LengthOfLastWord {

	public static void main(String[] args) {
		 String str="i am sreem  ";
		
		 int right=str.length()-1;
		 
		 while(str.length()>=0 && str.charAt(right)==' ') {
			right--;
			 
		 }
		int left=right;
		while(left>=0 && str.charAt(left)!=' ') {
			left--;
		}
		 System.out.println("length of the last String is "+(right-left));
	}

}
 