package com.test.level1.easy;

import java.util.Arrays;

public class KthNumber {

	public static void main(String[] args) {
		int[] arr = {3,5,2,8,6};
		getKthSmallestNumb(arr,0,4,3);

	}

	private static void getKthSmallestNumb(int[] arr, int i, int j, int k) {
		Arrays.sort(arr);
		System.out.println(arr[k]);
	}

}
