package com.learn.dsa;

import java.util.Arrays;

public class BubbleSort {

	 public static void main(String[] args) {

	        int[] myArray = {4,2,6,5,1,3};

	        bubbleSort(myArray);

	        System.out.println( Arrays.toString(bubbleSort(myArray)) );

	        /*
	            EXPECTED OUTPUT:
	            ----------------
	            [1, 2, 3, 4, 5, 6]

	         */

	    }

	    public static int[] bubbleSort(int[] arr){
	         int temp =0;
	        for (int i = arr.length;i>1;i--){
	            for(int j = 0; j<i-1;j++){
	               
	               if(arr[j]>arr[j+1]){
	                   temp = arr[j];
	                   arr[j]=arr[j+1];
	                   arr[j+1]=temp;
	               }
	            }
	        }
	        
	        return arr;
	    }

}
