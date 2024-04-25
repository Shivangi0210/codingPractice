package com.test.level1.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ReverseVowels {

	public static void main(String[] args) {
		System.out.println(reverseVowels("aA"));

	}
	public static String reverseVowels(String s) {
        char[] c = s.toCharArray();
        String result = "";
        Map<Integer,Character> map = new HashMap<>();
        Stack<Character> stk = new Stack<Character>();
        
        for (int i=0;i<c.length;i++){
            if(c[i]=='a' || c[i]=='e'|| c[i]=='i'|| c[i]=='o'|| c[i]=='u'
            	||	c[i]=='A' || c[i]=='E'|| c[i]=='I'|| c[i]=='O'|| c[i]=='U'){
               //3 map.put(i,c[i]);
                stk.push(c[i]);
            }
        }
        
        for(int i=0;i<c.length;i++) {
        	if(c[i]=='a' || c[i]=='e'|| c[i]=='i'|| c[i]=='o'|| c[i]=='u'
        			||	c[i]=='A' || c[i]=='E'|| c[i]=='I'|| c[i]=='O'|| c[i]=='U'){
        		c[i]= stk.pop();
        	}
        		
        }
       
        for(char cr : c) {
        	result = result+cr;
        }
        
        return  result;
    }
}
