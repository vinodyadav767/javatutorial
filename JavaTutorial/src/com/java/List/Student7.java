package com.java.List;

import java.util.ArrayList;
import java.util.List;

//<T> T[] toArray(T[] a)	It is used to return an array containing all of the elements in this list in the correct order.
public class Student7 {
public static void main(String[] args) {
	List<Integer> l=new ArrayList<Integer>();
	l.add(1);
	l.add(2);
	l.add(3);
	l.add(4);
	l.add(5);
	System.out.println("List: "+l);
	Integer intarr[]=new Integer[l.size()];
	intarr=l.toArray(intarr);
	System.out.print("List: ");
	for(Integer i:intarr)
		System.out.print(i+" ");
	
	List<String> l1=new ArrayList<String>();
	l1.add("A");
	l1.add("B");
	l1.add("C");
	l1.add("D");
	l1.add("E");
	System.out.println("List: "+l1);
	String strarr[]=new String[l1.size()];
	strarr=l1.toArray(strarr);
	for(String item:strarr)
		System.out.println(item);
}
}
