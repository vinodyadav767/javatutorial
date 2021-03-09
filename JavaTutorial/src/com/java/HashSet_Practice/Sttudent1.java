package com.java.HashSet_Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Sttudent1 {
	public static void main(String[] args) {
		// 1. Write a Java program to append the specified element to the end of a hash
		// set.
		HashSet<String> hs = new LinkedHashSet<String>();
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("D");
		hs.add("E");
		hs.add("F");
		System.out.println("Initial HashSet: " + hs);
		
		// 2. Write a Java program to iterate through all elements in a hash list.
		System.out.print("Iterate through all elements in a hash list: ");
		for (String item : hs)
			System.out.print(item + " ");
		System.out.println();
		// Another way
		Iterator itr = hs.iterator();
		System.out.print("Iterate through all elements in a hash list: ");
		while (itr.hasNext())
			System.out.print(itr.next() + " ");
		System.out.println();
		System.out.println();
		//3. Write a Java program to get the number of elements in a hash set.
		System.out.println("Number of elements in HS: " + hs.size());
		
		//4. Write a Java program to empty an hash set.
		System.out.println("HS before empty: " + hs);
		hs.clear();
		System.out.println("HS after clear: " + hs);
		
		//5. Write a Java program to test a hash set is empty or not. 
		if (hs.isEmpty())
			System.out.println("HS is empty ");
		else
			System.out.println("HS is not empty ");
		
		//6. Write a Java program to clone a hash set to another hash set.
		HashSet<Integer> hs1 = new LinkedHashSet<Integer>();
		hs1.add(10);
		hs1.add(20);
		hs1.add(30);
		hs1.add(40);
		hs1.add(50);
		System.out.println("First Hs: " + hs1);
		HashSet<Integer> hs2 = new LinkedHashSet<Integer>();
		System.out.println("Second Hs before clone: " + hs2);
		hs2 = (HashSet<Integer>) hs1.clone();
		System.out.println("HS Second after clone from Fisrt HS: " + hs2);
		System.out.println();
		
		//7. Write a Java program to convert a hash set to an array.
		Integer[] intarr = new Integer[hs1.size()];
		hs1.toArray(intarr);
		System.out.print("Array elements: ");
		for (int item : intarr)
			System.out.print(item + " ");
		System.out.println();
		System.out.println();
	      
	      //9.  Write a Java program to convert a hash set to a List/ArrayList. 
			ArrayList<Integer> al = new ArrayList<Integer>(hs1);
			System.out.println(al);
			System.out.println();

	      //10. Write a Java program to compare two hash set.
			System.out.println("First HS: " + hs1);
			System.out.println("Second HS: " + hs2);
			if (hs1.containsAll(hs2))
				System.out.println("Both HS are equal ");
			else
				System.out.println("Both HS are not equal ");
			System.out.println();
	      
	      //11. Write a Java program to compare two sets and retain elements which are same on both sets.
			hs1.add(60);
			hs1.add(70);
			System.out.println("First HS: " + hs1);
			System.out.println("First HS: " + hs2);
			hs1.retainAll(hs2);
			System.out.println("First HS after retain from First HS: " + hs1);
			System.out.println();
	      
	      //12. Write a Java program to remove all of the elements from a hash set.
			hs1.add(80);
			hs1.add(100);
			System.out.println("First HS: " + hs1);
			System.out.println("First HS: " + hs2);
			hs1.removeAll(hs2);
			System.out.println("First HS: " + hs1);
	}
}
