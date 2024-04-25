package com.learn.dsa;

public class Main {

	public static void main(String[] args) throws Exception {
	
		RemoveLinkedList ll = new RemoveLinkedList(1);
		ll.append(0);
		ll.append(1);
		ll.append(1);
		
		DoublyLinkedList dll = new DoublyLinkedList(1);
		dll.append(2);
		dll.append(3);
		dll.append(4);
		dll.append(5);
		dll.printList();
		dll.swapPairs();
		dll.printList();
		
		
		
		
		
	}

}
