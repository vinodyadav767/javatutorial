package com.java.AraryListPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class Student2 {
	public static void main(String[] args) {
		//1-Write a Java program to create a new array list, add some colors (string) and print out the collection
		ArrayList<String> al = new ArrayList<String>();
		al.add("Red");
		al.add("Green");
		al.add("Yellow");
		al.add("Pink");
		System.out.println("ArrayList with all the color: " + al);
		System.out.println();
		//2-Write a Java program to iterate through all elements in a array list.
		Iterator<String> itr = al.iterator();
		System.out.print("ArrayList with all color: ");
		while (itr.hasNext())
			System.out.print(itr.next() + " ");
		System.out.println();
		System.out.println();
		//Another way
		System.out.println("Anotherway: ");
		System.out.print("All colors of ArrayList: ");
		for (String item : al)
			System.out.print(item + " ");
		System.out.println();
		System.out.println();
		
		//3-Write a Java program to insert an element into the array list at the first position
		System.out.println("ArrayList before addind at fisrt position: " + al);
		al.add(0, "Black");
		System.out.println("ArrayList before addind at fisrt position: " + al);
		System.out.println();
		
		//4-Write a Java program to retrieve an element (at a specified index) from a given array list.
		System.out.println("Getting values from first position: " + al.get(0));
		System.out.println("Getting values from Second position: " + al.get(1));
		System.out.println("Getting values from third position: " + al.get(2));
		System.out.println();
		
		//5-Write a Java program to update specific array element by given element.
		System.out.println("Array list before Update: " + al.get(2) + al);
		al.set(2, "Blue");
		System.out.println("ArrayList after update: " + al.get(2) + al);
		System.out.println();
		
		//6-Write a Java program to remove the third element from a array list.
		System.out.println("ArrayList before removing 3rd element: " + al.get(2) + al);
		al.remove(2);
		System.out.println("ArrayList after removing 3rd element: " + al);
		System.out.println();
		
		//7-Write a Java program to search an element in a array list
		if (al.contains("Yellow"))
			System.out.println("We found Yellow: ");
		else
			System.out.println("We didn't find Yellow");
		System.out.println();
		
		//8-Write a Java program to sort a given array list. 
		System.out.println("ArrayList before sort: " + al);
		Collections.sort(al);
		System.out.println("ArrayList after sort: " + al);
		System.out.println();
		
		//9-Write a Java program to copy one array list into another.
		ArrayList<String> al1 = new ArrayList<String>();
		System.out.println("AL Second before copying all elements from AL first: " + al1);
		al1.addAll(al);
		System.out.println("AL Second after copying al elements from AL first: " + al1);
		System.out.println();
		
		//10-Write a Java program to shuffle elements in a array list.
		al.add("Green");
		al.add("Blue");
		System.out.println("ArrayList before shuffle: " + al);
		Collections.shuffle(al);
		System.out.println("ArrayList after shuffle: " + al);
		System.out.println();
		
		//11-Write a Java program to reverse elements in a array list
		System.out.println("AL before reverse: " + al);
		Collections.reverse(al);
		System.out.println("Reverse ArrayList: " + al);
		System.out.println();

		//12-Write a Java program to extract a portion of a array list.
		List<String> al2 = new ArrayList<String>();
		System.out.println("Initial AL: " + al2);
		al2 = al.subList(1, 4);
		System.out.println("After extracting a portion of a array list" + al2);
		System.out.println();
		
		//13-Write a Java program to compare two array lists.
		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("A");
		al3.add("B");
		al3.add("C");
		al3.add("D");
		ArrayList<String> al4 = new ArrayList<String>();
		al4.add("A");
		al4.add("B");
		al4.add("C");
		al4.add("D");
		System.out.println("AL First before compare: " + al3);
		System.out.println("AL Second before compare: " + al4);
		if (al3.containsAll(al4))
			System.out.println("Both AL are same ");
		else
			System.out.println("Both AL are not same");
		al4.add("E");

		System.out.println();

		System.out.println("AL First before compare: " + al3);
		System.out.println("AL Second before compare: " + al4);
		if (al3.containsAll(al4))
			System.out.println("Both AL are same ");
		else
			System.out.println("Both AL are not same");
		System.out.println();
	
		//14-Write a Java program of swap two elements in an array list.
		System.out.println("AL before swape: " + al4);
		Collections.swap(al4, 1, 3);
		System.out.println("AL after swape: " + al4);
		System.out.println();
		 
		 //15-Write a Java program to join two array lists
			System.out.println("AL First before joining AL Second: " + al4);
			System.out.println("AL Second: " + al3);
			al4.addAll(al3);
			System.out.println("AL after joining AL Second: " + al4);
			System.out.println();
		 
		 //16-Write a Java program to clone an array list to another array list
			ArrayList<String> al5 = new ArrayList<String>();
			System.out.println("AL before clone" + al5);
			al5 = (ArrayList<String>) al4.clone();
			System.out.println("AL after clone: " + al5);
			System.out.println();
		 
		 //17-Write a Java program to empty an array list.
			System.out.println("AL before empty: " + al5);
			al5.clear();
			System.out.println("AL after empty: " + al5);
			System.out.println();
		 
		 //18-Write a Java program to test an array list is empty or not. 
			ArrayList<String> al6 = new ArrayList<String>();
			al6.add("A");
			al6.add("B");
			al6.add("C");
			al6.add("D");
			System.out.println("AL elements: " + al6);
			if (al6.isEmpty())
				System.out.println("AL is empty now: ");
			else
				System.out.println("AL is not empty: ");

			System.out.println();
			al6.clear();
			System.out.println("AL after clear: " + al6);
			if (al6.isEmpty())
				System.out.println("AL is empty now: ");
			else
				System.out.println("AL is not empty: ");
			System.out.println();
			
			//19-Write a Java program to trim the capacity of an array list the current list size.
			ArrayList<String> al7 = new ArrayList<String>();
			al7.add("A");
			al7.add("B");
			al7.add("C");
			al7.add("D");
			System.out.println("Size of AL before changing: " + al7.size() + al7);
			al7.trimToSize();
			System.out.println("Size of AL before changing: " + al7.size());
			System.out.println();
			
			//20- 20. Write a Java program to increase the size of an array list.
			ArrayList<String> al8 = new ArrayList<String>();
			al8.add("A");
			al8.add("B");
			al8.add("C");
			al8.add("D");
			System.out.println("AL after ensureCapacity: " + al8);
			al8.ensureCapacity(6);
			al8.add("E");
			al8.add("F");
			System.out.println("Al after ensureCapacity: " + al8);
			System.out.println();
			
			//Write a Java program to replace the second element of a ArrayList with the specified element
			System.out.println("Elements of AL: "+al8);
			al8.set(1, "P");
			System.out.println("Elements of AL after Set: "+al8);
			System.out.println();
			
			//Write a Java program to print all the elements of a ArrayList using the position of the elements.
			System.out.print("Al suing position :");
			for(int i=0;i<al8.size();i++)
				System.out.print(al8.get(i)+" ");
	}
}
