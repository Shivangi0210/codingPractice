package com.learn.dsa;

import java.util.Arrays;

public class SelectionSort {

	static void  selectionSort(int[] myArray){
	    
	    for(int i =0;i<myArray.length;i++){
	    	int min =i;
	        for(int j =i+1; j< myArray.length;j++){
	            if(myArray[j]<myArray[min]){
	                min = j;
	            }
	        }
	       
	            int temp = myArray[i];
	           myArray[i] = myArray[min];
	           myArray[min] = temp;
	        
	        
	    }
	    
	}
	
	
    public static void main(String[] args) {

        int[] myArray = {4,2,6,5,1,3};

        selectionSort(myArray);

        System.out.println( Arrays.toString(myArray) );

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6]

         */

    }
}
