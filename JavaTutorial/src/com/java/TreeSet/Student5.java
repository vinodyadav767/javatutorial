package com.java.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

//All methods
public class Student5 {
	public static void main(String[] args) {
		// boolean add(E e)
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("A");
		ts.add("B");
		ts.add("C");
		ts.add("D");
		ts.add("E");
		ts.add("P");
		ts.add("S");
		ts.add("Z");
		System.out.println("Initialy TreeSet: " + ts);

		// boolean addAll(Collection<? extends E> c)
		TreeSet<String> ts1 = new TreeSet<String>();
		ts1.add("E");
		ts1.add("G");
		ts1.add("F");
		ts1.add("P");
		System.out.println("TreeSet First: " + ts);
		System.out.println("TreeSet Second: " + ts1);
		ts.addAll(ts1);
		System.out.println("All the elements of TS: " + ts);
		System.out.println();

		// E ceiling(E e)
		System.out.println("Find A: with ceiling " + ts.ceiling("A"));
		System.out.println("Dind B with ceiling " + ts.ceiling("B"));
		System.out.println("Dind G with ceiling " + ts.ceiling("G"));
		System.out.println("Dind H with ceiling " + ts.ceiling("H"));
		System.out.println();

		// Iterator descendingIterator()
		System.out.println("TreeSet: " + ts);
		System.out.print("TreeSet in descending order: ");
		Iterator itr = ts.descendingIterator();
		while (itr.hasNext())
			System.out.print(itr.next() + " ");
		System.out.println();
		System.out.println();

		// NavigableSet descendingSet()
		System.out.println("TreeSet before reverse: "+ts);
		System.out.println("TreeSet after reverse: "+ts.descendingSet());
		System.out.println();
		
		//E floor(E e) 
		System.out.println("TreeSet :"+ts);
		System.out.println("trying find E: "+ts.floor("E"));
		System.out.println("trying find J: "+ts.floor("J"));
		System.out.println("trying find W: "+ts.floor("W"));
	}
}
