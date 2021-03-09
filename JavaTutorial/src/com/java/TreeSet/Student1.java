package com.java.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Student1 {
public static void main(String[] args) {
	TreeSet<String> ts=new TreeSet<String>();
	ts.add("A");
	ts.add("B");
	ts.add("C");
	ts.add("D");
	ts.add("E");
	System.out.println("Initial TreeSet: "+ts);
	Iterator itr=ts.iterator();
	System.out.print("Initial TreeSet by Iterator: ");
	while(itr.hasNext())
		System.out.print(itr.next()+" ");
	System.out.println();
	System.out.println();
	
	Iterator itr1=ts.descendingIterator();
	System.out.print("TreeSet in reverse order: ");
	while(itr1.hasNext())
		System.out.print(itr1.next()+" ");
	System.out.println();
	System.out.println();
	
	System.out.println("TreeSet before polfirst and polLast"+ts);
	System.out.println(ts.pollFirst()+" "+ts.pollLast());
	System.out.println("TreeSet after polfirst and polLast"+ts);
	
}
}
