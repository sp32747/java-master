package com.sree.leet;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class ValidParanthesis {

	public static void main(String[] args) {
		
		
		HashMap<Character, Character> mappings = new HashMap();
		    mappings.put(')', '(');
		   mappings.put('}', '{');
		    mappings.put(']', '[');
		    //[{()}] ,[}
		   System.out.println(isValid("(){}[]", mappings));
		    
	}
	
	public static boolean isValid(String s, HashMap<Character, Character> mappings) {
	    Stack<Character> stack = new Stack();
	    for (int i = 0; i < s.length(); i++) {
	      char c = s.charAt(i);
	      if (mappings.containsKey(c)) {
	        char topElement = stack.empty() ? '#' : stack.pop();
	        if (topElement != mappings.get(c)) {
	          return false;
	        }
	      } else {
	        stack.push(c);
	      }
	    }
	    return stack.isEmpty();
	  }
	
	
}
