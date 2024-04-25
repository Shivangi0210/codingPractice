package com.learn.dsa;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class RemoveLinkedList {

    private Node head;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public RemoveLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }
    
    public void makeEmpty() {
        head = null;
        length = 0;
    }
    
    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }
    
    public void removeDuplicates(){
    	
    	Node temp = head;
    	Set<Integer> setLL = new HashSet<>();
    	for(int i = 0; i<length; i++) {
    		setLL.add(temp.value);
    		temp = temp.next;
    	}
    	temp = head;
    	Iterator<Integer> itr = setLL.iterator();
    	for(int  i=0;i<setLL.size()-1;i++) {
    		temp.value = itr.next();
    		temp = temp.next;
    	}
    	temp.value = itr.next();
    	temp.next=null;
    	
    }
    
 public void removeDuplicates1(){
    	
	  Node temp = head;
	  Node pre = null;
  	Set<Integer> setLL = new HashSet<>();
  	
  	 while(temp!=null){
 	    if(setLL.contains(temp.value)){
 	    	pre.next = temp.next;
 	    	

 	        
 	        length --;
 	    }
 	    else{
 	        setLL.add(temp.value);
 	       pre = temp;
 	    }
 	   temp = temp.next;
 	   
 	}
  	
  	
    }
 
 public int binaryToDecimal(){
     
     Node temp = head;
     int num = 0;
     while(temp!=null){
         num = num*2+temp.value;
         temp = temp.next;
     }
     return num;
 }
}

