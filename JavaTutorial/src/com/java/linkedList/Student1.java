package com.java.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

//Java LinkedList Example
public class Student1 {
public static void main(String[] args) {
	LinkedList<String> ll=new LinkedList<String>();
	ll.add("Vinod");
	ll.add("Sohan");
	ll.add("Satish");
	System.out.println("List: "+ll);
	Iterator itr=ll.iterator();
	System.out.print("List: ");
	while(itr.hasNext())
		System.out.print(itr.next()+" ");
}
}
