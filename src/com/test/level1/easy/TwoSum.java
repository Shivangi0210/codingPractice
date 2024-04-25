package com.test.level1.easy;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TwoSum {

public static void main(String... args) {
		int[] nums = {1,2,3,4};
		int sum = Arrays.stream(nums).sum();
		int[] value = twoSum(nums,6);
		System.out.println("value ----"+String.valueOf(value[0])+String.valueOf(value[1]));
}
	
	 public static int[] twoSum(int[] nums, int target) {
	        
		 
		 int[] result = new int[2];
	        for(int i=0; i<nums.length; i++){
	            if(nums[i]<target) {
	            	
	            	
	            	for(int j=i+1;j<nums.length;j++) {
	            		if(nums[i]+nums[j]==target) {
	            			result[0]=i;
	            			result[1]=j;
	            			break;
	            		}
	            	}
	            	}
	            }
	        return result;
	        }

	    }

