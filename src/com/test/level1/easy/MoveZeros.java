package com.test.level1.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MoveZeros {

	public static void main(String[] args) {
		
		int[] nums = {1,1,1,0,0,1};
		Arrays.stream(moveZeroes(nums)).forEach(System.out:: println);

	}

	public static int[] moveZeroes(int[] nums) {
        int zeroIndex = 0;
        int len = nums.length;
        for (int i =1; i<=len-1;i++){
            int temp=0;
            if( nums[zeroIndex]==0 && nums[i]!=0 ){
                
               temp = nums[zeroIndex];
               nums[zeroIndex]=nums[i];
               nums[i]=temp;
                zeroIndex ++;
            } else if(nums[zeroIndex]!=0 ) {
            	zeroIndex ++;
            }
        }
        return nums;
    }
}
