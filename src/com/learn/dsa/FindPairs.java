package com.learn.dsa;

import java.util.*;


public class FindPairs {
	
	


	private static List<int[]> findPairs(int[] arr1, int[] arr2, int target) {
		List<int[]> result = new ArrayList<>();
		
		
		
		Set<Integer> mySet1 = new HashSet<>();
		Set<Integer> mySet2 = new HashSet<>();
		for(int i : arr2) {
			mySet2.add(i);
		}
		for(int i : arr1) {
			mySet1.add(i);
		}
		
		
		for(int i =0; i< mySet1.size();i++) {
			int temp = target-arr1[i];
			if(mySet2.contains(temp)) {
				result.add(new int[] {mySet1.,target-arr1[i]});
			}
			
		}
		
		
		return result;
	}


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8, 10};
        int target = 7;

        List<int[]> pairs = findPairs(arr1, arr2, target);
        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }

        /*
            EXPECTED OUTPUT:
            ----------------
            [5, 2]
            [3, 4]
            [1, 6]
           
        */
        
    }

    
}

    