package com.test.level1.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SubsequenceStrings {
	
	public static void main(String... args) {
		
		boolean value = isSubsequenceString("xyz","afdhbrcde");
		System.out.println("value ----"+String.valueOf(value));
		String s = "Shivangi";
		
	}

	private static boolean isSubsequenceString(String s, String t) {
		
		int i=0,j=0;
	    int n=t.length();
	    int m=s.length();
	    char ss[]=s.toCharArray();
	    char tt[]=t.toCharArray();

	    if(m<1)
	        return true;

	    while(i<n){
	        if(tt[i]==ss[j]){
	            j++;
	        }
	        i++;
	        
	    if(j==m)
	        return true;
	    }

	        return false;
	    
		
	}

}
