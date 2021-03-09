package com.java.Listiterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//All methods of ListIterator
public class Student1 {
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		System.out.println("List :" + l);
		ListIterator<String> lit = l.listIterator();
		lit.add("E");
		lit.add("F");
		System.out.print("Traversing elements in forword direction: ");
		while (lit.hasNext())
			System.out.print(lit.next() + " ");
		System.out.println();

		System.out.print("Traversing elements in backword direction: ");
		while (lit.hasPrevious())
			System.out.print(lit.previous() + " ");
		System.out.println();
		System.out.println();
		
		System.out.println();
	
	}
}
