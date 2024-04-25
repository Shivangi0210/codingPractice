package com.test.level1.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class SegregateElements {

	public static void main(String[] args) {
		int[] arr = {1, -1, 3, 2, -7, -5, 11, 6 };
		segregateElements(arr,arr.length);

	}

	private static void segregateElements(int[] arr, int n) {
		
		int a = 0,b=0,temp = 0;
		Map<String,Integer> map12 = new HashMap<>();
		Stack<Integer> stk = new Stack<>();
		
		for(int i :arr) {
			stk.push(i);
			if(i<0)
				map12.put("Negative", ++a);
			else
				map12.put("Positive", ++b);
			
		}
		
		int k=a,j=0;
		
		for(int i=0;i<arr.length;i++) {
			
			 temp = stk.pop();
			
			if(temp<0)
				arr[--n]=temp;
			else
				arr[--b]=temp;
		}
		
		Arrays.stream(arr).forEach(System.out::print);
 	}

}
