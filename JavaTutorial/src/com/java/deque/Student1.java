package com.java.deque;

import java.util.ArrayDeque;
import java.util.Deque;

//All the methods of Deque
public class Student1 {
public static void main(String[] args) {
	Deque<String> dq=new ArrayDeque<String>();
	//boolean add(object)	It is used to insert the specified element into this deque and return true upon success.
	dq.add("A");
	dq.add("B");
	dq.add("C");
	dq.add("D");
	dq.add("E");
	System.out.println("Initial DQ: "+dq);
	System.out.println();
	
	//boolean offer(object)	It is used to insert the specified element into this deque.
	dq.offer("F");
	System.out.println("DQ: "+dq);
	dq.offerFirst("G");
	System.out.println("After using offerFirst: "+dq);
	dq.offerLast("H");
	System.out.println("After using offerLast: "+dq);
}
}
