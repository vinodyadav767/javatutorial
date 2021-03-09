package com.java.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

//Java LinkedList Example to reverse a list of elements
public class Student4 {
public static void main(String[] args) {
LinkedList<String> ll=new LinkedList<String>();
ll.add("Vinod");
ll.add("Sohan");
ll.add("Satish");
Iterator itr=ll.descendingIterator();
System.out.print("LL in descending order: ");
while(itr.hasNext())
	System.out.print(itr.next()+" ");
}
}
