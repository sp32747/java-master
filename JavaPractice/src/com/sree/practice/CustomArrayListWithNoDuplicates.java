package com.sree.practice;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayListWithNoDuplicates  extends ArrayList{
	
	
	@Override
	public boolean add(Object o) {
		
	if(this.contains(o)) {
		return true;
	}
	else {
		return super.add(o);
	}
	
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		CustomArrayListWithNoDuplicates alist=new CustomArrayListWithNoDuplicates();
		alist.add(1);
		alist.add(2);
		alist.add(3);
		alist.add(1);
		
		System.out.println(alist);		

	}

}
