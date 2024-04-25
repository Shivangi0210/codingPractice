package com.learn.dsa;

public class LinkedList {

	class Node {

		 int value;
		 Node next;
		 
		 Node(int value){
			 this.value = value;
		 }
		 
		 Node(int value, Node node){
			 this.value = value;
			 this.next = node;
		 }
		 
		 Node(){}
	}
	
	//create new node
	private Node head,  tail ;
	int length = 0;
	
	LinkedList(int value){
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length++;
	}
	
	public void append(int value) {
		Node newNode = new Node(value);
		if(length == 0 ) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		
		length++;
	}
	
	public void printList() {
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
	
	public Node removeLast() throws Exception {
		if(length==0)
			throw new Exception("No element in the list");
		
		Node temp = head;
		Node pre = head;
		
		while(temp.next!=null) {			
			pre = temp;
			temp = temp.next;		
		}	
		tail=pre;
		tail.next = null;
		length--;
		if(length==0) {
			head = null;
			tail = null;
		}
		
		return temp;
	}
	
	public void prepend(int value) {
		Node newNode = new Node(value);
		if(length ==0) {
			head = newNode;
			tail = newNode;
		}
		
		else {
		Node temp = head;
		head = newNode;
		head.next = temp;
		}
		length++;
	}
	
	public Node removeFirst() {
		Node temp = head;
		if(length==0)
			return null;
		if(length==1) {
			head.next = null;
			tail.next = null;
		} else {
		
		head = head.next;
		temp.next=null;
		}
		length--;
		if(length==0)
			tail =null; 
		
		return temp;
	}
	
	public Node get(int index) {
		Node temp = head;
		if(index<0 || index >=length)
			return null;
		
		for(int i=0;i<index;i++) {
			temp = temp.next;
		}
		return temp;
	}
	
	public boolean set(int index, int value) {		
		if(index<0 || index >=length)
			return false;
		
		Node temp = get(index);
		temp.value = value;
		
		return true;
		
	}
	
	public Node remove(int index) throws Exception {
		
		if(index==0)
			return removeFirst();
		
		if(index==length-1) 
			return removeLast();
			
		Node pre = get(index-1);
		Node temp = get(index);
		
		pre.next = temp.next;
		temp.next =null;
		
		return pre;
		
	}
	
	public void reverse() {
		Node temp = head;
		
		head = tail;
		
		tail = temp;
		
		Node after = temp.next;
		
		Node before = null;
		
		for(int i =0;i<length;i++) {
			
			after = temp.next;
			temp.next = before;
			before = temp;
			temp = after;
			
			
		}
		
	}
}
