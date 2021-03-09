package com.java.TreeSet;

import java.util.TreeSet;

//various NavigableSet operations
public class Student2 {
public static void main(String[] args) {
	TreeSet<Integer> ts=new TreeSet<Integer>();
	ts.add(1);
	ts.add(2);
	ts.add(3);
	ts.add(5);
	ts.add(10);
	ts.add(4);
	ts.add(6);
	ts.add(8);
	ts.add(15);
	ts.add(20);
	ts.add(25);
	ts.add(50);
	ts.add(30);
	ts.add(40);
	System.out.println("Initial TreeSet: "+ts);
	System.out.println("Reverse TreeSet: "+ts.descendingSet());
	System.out.println("HeadSet: "+ts.headSet(20));
	System.out.println("HeadSet: "+ts.headSet(20, true));
	System.out.println("HeadSet: "+ts.headSet(20, true));
	System.out.println();
	
	System.out.println("TailSet: "+ts.tailSet(5));
	System.out.println("TailSet: "+ts.tailSet(5, false));
	System.out.println("TailSet: "+ts.tailSet(5, true));
	System.out.println();
	
	System.out.println("SubTreeSet: "+ts.subSet(2, 40));
	System.out.println("SubTreeSet: "+ts.subSet(10, false, 50, true));
	System.out.println("SubTreeSet: "+ts.subSet(10, true, 50, false));
}
}
