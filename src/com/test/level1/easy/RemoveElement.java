package com.test.level1.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class RemoveElement {

	public static void main(String[] args) {
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3 };
		List<Integer> arrList = Arrays.asList(1,2,3);
		int s=0;
		arrList.stream().forEach(i->System.out.println(i	));
		removeDuplicates(nums);
	}

	public static int removeDuplicates(int[] nums) {
		int j = 0;
		int k = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1] && k != 2) {

				nums[j] = nums[i];
				j++;
				k = 0;
			} else if (k < 2) {
				nums[j] = nums[i];
				j++;
				k++;
			}
			else
				k=0;
			System.out.println(nums[j]);
		}
		return j;
	}

}
