package com.test.level1.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaxProfit {

	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		int profit = calcProfit(prices);
	}

	private static int calcProfit(int[] p) {
		boolean ordered = false;
		for(int i =0;i<p.length;i++) {
			if(p[i]<p[i+1]) {
				ordered = true;
			}
			else {
				ordered =false;
				break;}
		}
		if(ordered)
			return 0;
		
		Map<Integer, Integer> priceMap = new HashMap<>();
		for(int i=0;i<p.length;i++) {
			priceMap.put(i, p[i]);
		}
		
		priceMap.entrySet().stream().max
		
		return 0;
	}
	

}
