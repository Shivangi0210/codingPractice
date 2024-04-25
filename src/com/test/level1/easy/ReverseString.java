package com.test.level1.easy;

import java.util.Stack;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println(reverseString("shivangi"));

	}

	private static String reverseString(String value) {
		 char[] strArr = value.toCharArray();
	        Stack stk = new Stack();
	        StringBuilder strbld = new StringBuilder();
	        for(int i =0;i<strArr.length;i++){
	            stk.push(strArr[i]);
	        }
	        while(!stk.isEmpty()){
	            strbld = strbld.append(stk.pop());
	        }
	        
	        return strbld.toString();
	}
	
	

}
