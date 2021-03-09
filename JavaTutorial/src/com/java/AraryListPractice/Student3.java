package com.java.AraryListPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class Student3 {
public static void main(String[] args) {
	//1-How to remove duplicates from ArrayList in Java
	ArrayList<String> al=new ArrayList<String>();
	al.add("A");
	al.add("B");
	al.add("A");
	al.add("C");
	al.add("B");
	System.out.println("AL with all ele: "+al);
	HashSet<String> hs=new HashSet<String>(al);
	hs.addAll(al);
	System.out.println(hs);
	LinkedHashSet<String> lhs=new LinkedHashSet<String>(al);
	lhs.addAll(al);
	System.out.println(lhs);
	
	//2-How to reverse ArrayList in Java?
	
	ArrayList<String> al2=new ArrayList<String>();
	al2.add("A");
	al2.add("B");
	al2.add("C");
	al2.add("D");
	al2.add("E");
	al2.add("F");
	System.out.println("AL before revese: "+al2);
	Collections.reverse(al2);
	System.out.println("Al after revese: "+al2);
	Collections.reverse(al2);
	System.out.println("Al after revese again: "+al2);
	LinkedList<String> ll=new LinkedList<String>(al2);
	Iterator<String> itr=ll.descendingIterator();
	System.out.print("Reverse List: ");
	while(itr.hasNext())
		System.out.print(itr.next()+" ");
	
	//3-Difference between an array and an ArrayList in Java?
	ArrayList<Integer> al3=new ArrayList<Integer>();
	al3.add(10);
	al3.add(20);
	al3.add(30);
	al3.add(40);
	al3.add(50);
	al3.add(60);
}
}
