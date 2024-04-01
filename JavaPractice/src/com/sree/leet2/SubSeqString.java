package com.sree.leet2;

public class SubSeqString {
	
	
	public static void main(String[] args) {
		String s1="srikx";
		String s2="panisrikgrahi";
		
		int p1=0,p2=0;
		
		while (p1<s1.length() && p2<s2.length()) {
			
			if(s2.charAt(p2)==s1.charAt(p1)) {
				p1++;
				p2++;
			}
			else {
				p2++;
			}
		}
		
		System.out.println(p1==s1.length());
		
		
		
	}

}
