package com.test.level1.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Sort012 {

	public static void main(String[] args) {
		int[] arr = {0,1,2,0,1,2,2,0,0,0,2,1,1};
		sort012(arr);

	}

	private static void sort012(int[] arr) {
		int a = 0,b=0,c=0;
		Map<Integer,Integer> map12 = new HashMap<>();
		for(int i : arr) {
			
			switch(i) {
			 
			case 0:
				map12.put(0, ++a);
				continue;
			
			case 1:
				map12.put(1, ++b);
				continue;
				
			case 2:
				map12.put(2, ++c);
				continue;
				
			
			
			}
			
		}
		
		a = map12.get(0);
		b= map12.get(1);
		c = map12.get(2);
		for(int i =0;i<a;i++) {
			arr[i]=0;
		}
		for(int i =a;i<a+b;i++) {
			arr[i]=1;
		}
		
		for(int i =a+b;i<a+b+c;i++) {
			arr[i]=2;
		}
		
		Arrays.stream(arr).forEach(System.out::print);
		
	}

}
