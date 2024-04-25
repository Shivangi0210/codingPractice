package com.test.level1.easy;

import java.util.Stack;

/**
 * Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

 

Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 * @author ssing108
 *
 */
public class ReverseSentence {

	public static void main(String[] args) {
		String s =" hello mam how are  you ";
		System.out.println(reverseWords(s));

	}

	private static String reverseWords(String s) {
	    // Split the string into words using whitespace as delimiter
	    String[] words = s.trim().split("\\s+");
	    
	    // Reverse the array of words
	    int left = 0, right = words.length - 1;
	    while (left < right) {
	        // Swap words[left] and words[right]
	        String temp = words[left];
	        words[left] = words[right];
	        words[right] = temp;
	        
	        // Move to the next pair of words
	        left++;
	        right--;
	    }
	    
	    // Join the words back into a string
	    StringBuilder reversed = new StringBuilder();
	    for (String word : words) {
	        reversed.append(word).append(" ");
	    }
	    
	    // Trim any trailing whitespace and return the reversed string
	    return reversed.toString().trim();
	}


}
