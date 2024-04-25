package com.test.level1.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class ValidParantheses {

	public static void main(String[] args) {
		String s = "{()}";
		System.out.println(isValid(s));

	}

	private static boolean isValid(String s) {
		
		char[] arr = s.toCharArray();
		Stack<Character> st = new Stack<>();
		arr.
		
		for(char x : arr) {
			if(x =='{')
				st.push('}');
			else if(x=='(')
				st.push(')');
			else if (x=='[')
				st.push(']');
			else if (st.isEmpty() || st.pop()!=x)
				return false;
	
		}
		
		return st.isEmpty();
		
	}

}
