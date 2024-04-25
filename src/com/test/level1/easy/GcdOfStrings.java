package com.test.level1.easy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;

/**
 * For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

 

Example 1:

Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
Example 2:

Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"
Example 3:

Input: str1 = "LEET", str2 = "CODE"
Output: ""
 
 * @author ssing108
 *
 */
public class GcdOfStrings {

	public static void main(String[] args) {
		String str1="TAUXXTAUXXTAUXXTAUXXTAUXX", str2 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";
		System.out.println(gcdOfString(str1, str2)); 

	}

	private static String gcdOfString(String str1, String str2) {
		
		String result = "";
			char[] char1 = str1.toCharArray();
			char[] char2 = str2.toCharArray();
			char c = char1[0];
			String gcd1 = str1.substring(0,1);
			for(int i =1;i<char1.length;i++) {
				if(c!=char1[i]) {
					gcd1 = gcd1+String.valueOf(char1[i]);
				}
				else{
					break;
				}
			}
			
			String gcd2 = str2.substring(0,1);
			for(int i =1;i<char2.length;i++) {
				if(c!=char2[i]) {
					gcd2 = gcd2+String.valueOf(char2[i]);
				}
				else {
					break;
				}
			}
			
			if(gcd1.equals(gcd2))
				return gcd1;
		
		return null;
	}

}
