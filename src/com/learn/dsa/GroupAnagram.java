package com.learn.dsa;

import java.util.*;


public class GroupAnagram {
    
    public static List<List<String>> groupAnagrams(String[] arr){
        List<List<String>> grpAnaList = new ArrayList()<>();
        List<String> strList = new ArrayList()<>();
        Map<Integer, String> map = new HashMap<>();
        for(int i =0;i<arr.length-1;i++) {
        	map.put(i, arr[i]);
        	 arr[i].
        }
        
        
    }
    

    public static void main(String[] args) {
        System.out.println("1st set:");
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

        System.out.println("\n2nd set:");
        System.out.println(groupAnagrams(new String[]{"abc", "cba", "bac", "foo", "bar"}));

        System.out.println("\n3rd set:");
        System.out.println(groupAnagrams(new String[]{"listen", "silent", "triangle", "integral", "garden", "ranged"}));

        /*
            EXPECTED OUTPUT:
            ----------------
            1st set:
            [[eat, tea, ate], [tan, nat], [bat]]

            2nd set:
            [[abc, cba, bac], [foo], [bar]]

            3rd set:
            [[listen, silent], [triangle, integral], [garden, ranged]]

        */
        
    }
    
}
