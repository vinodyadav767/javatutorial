package com.java.TreeSet;

import java.util.TreeSet;

//various NavigableSet operations
public class Student3 {
public static void main(String[] args) {
	TreeSet<String> ts=new TreeSet<String>();
	ts.add("A");
	ts.add("B");
	ts.add("D");
	ts.add("P");
	ts.add("Z");
	ts.add("E");
	ts.add("S");
	ts.add("Q");
	System.out.println("TreeSet: "+ts);
	System.out.println("Reverse TreeSet: "+ts.descendingSet());
	System.out.println();
	
	System.out.println("TreeSet: "+ts);
	System.out.println("SubTreeSet: "+ts.subSet("D", "S"));
	System.out.println("SubTreeSet: "+ts.subSet("D", false, "S", true));
	System.out.println("SubTreeSet: "+ts.subSet("D", true, "S", false));
	System.out.println();
	
	System.out.println("TreeSet: "+ts);
	System.out.println("Head TreeSet: "+ts.headSet("Q"));
	System.out.println("Head TreeSet: "+ts.headSet("Q", true));
	System.out.println("HeadSet: "+ts.headSet("S"));
	System.out.println("HeadSet: "+ts.headSet("S", true));
	System.out.println();
	
	System.out.println("TreeSet: "+ts);
	System.out.println("Tail TreeSet: "+ts.tailSet("E"));
	System.out.println("Tail TreeSet: "+ts.tailSet("E", false));
	System.out.println("Tail TreeSet: "+ts.tailSet("E", true));
	
}
}
