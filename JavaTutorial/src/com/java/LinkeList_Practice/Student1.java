package com.java.LinkeList_Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

//1. Write a Java program to append the specified element to the end of a linked list.
public class Student1 {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("A");
		ll.add("B");
		ll.add("C");
		ll.add("D");
		ll.add("E");
		ll.add("F");
		ll.add("G");
		ll.add("H");
		ll.add("I");
		ll.add("J");
		ll.add("K");
		ll.add("L");
		System.out.println("Initial LinkedList: " + ll);
		ll.addLast("E");
		System.out.println("Linked List after adding an element at th end: " + ll);
		// AnotherWay
		System.out.println("LL before adding an element at end: " + ll);
		if (ll.offerLast("F"))
			System.out.println("New element added succesfully at the end");
		else
			System.out.println("The element not added");

		System.out.println("LL after adding an element at end: " + ll);
		ll.add("G");
		System.out.println(ll);

		// 2. Write a Java program to iterate through all elements in a linked list.
		Iterator itr = ll.iterator();
		System.out.print("LL by iterator: ");
		while (itr.hasNext())
			System.out.print(itr.next() + " ");
		System.out.println();

		System.out.print("Anotherway: ");
		for (String item : ll)
			System.out.print(item + " ");
		System.out.println();
		System.out.println();

		// 3-Write a Java program to iterate through all elements in a linked list
		// starting at the specified position.
		System.out.println("LL before: " + ll);
		System.out.print("After iterate from spesific pos 2: ");
		for (int i = 2; i < ll.size(); i++)
			System.out.print(ll.get(i) + " ");
		System.out.println();

		System.out.print("LL iterate all elements in a linked list starting at the specified position: ");
		Iterator itr1 = ll.listIterator(2);
		while (itr1.hasNext())
			System.out.print(itr1.next() + " ");
		// 4-Write a Java program to iterate a linked list in reverse order.
		System.out.print("Iterate a linked list in reverse order: ");
		Iterator itr2 = ll.descendingIterator();
		while (itr2.hasNext())
			System.out.print(itr2.next() + " ");

		// 5-Write a Java program to insert the specified element at the specified
		// position in the linked list.
		ll.add(2, "I");
		System.out.println("LL after adding I at position 2: " + ll);

		//6,7,8 Write a Java program to insert elements into the linked list at the first and last position.
		ll.offerFirst("J");
		ll.offerLast("K");
		System.out.println("Inserting elements into the linked list at the first and last position" + ll);
		// Another way
		ll.addFirst("L");
		ll.addLast("M");
		System.out.println("Inserting elements into the linked list at the first and last position" + ll);

		//9-Write a Java program to insert all elements of other LL at the specified position into a linked list.
		LinkedList<String> ll1 = new LinkedList<String>();
		ll1.add("N");
		ll1.add("O");
		ll1.add("P");
		ll.addAll(1, ll1);
		System.out.println("After adding all elements of LL 2: " + ll);

		//10 Write a Java program to get the first and last occurrence of the specified elements in a linked list	
		System.out.println("Now LL: " + ll);
		Object obj = ll.getFirst();
		Object obj1 = ll.getLast();
		System.out.println(obj);
		System.out.println(obj1);

		//11-Write a Java program to display the elements and their positions in a linked list
		for (int i = 0; i < ll.size(); i++)
			System.out.print(ll.get(i) + "-" + i + ",");

		//12. Write a Java program to remove a specified element from a linked list.
		ll.remove(2);
		System.out.println("LL after remove a specified element " + ll);

		//13. Write a Java program to remove first and last element from a linked list.
		ll.removeFirst();
		System.out.println("LL after remove first element: " + ll);
		ll.removeLast();
		System.out.println("Ll after remove Last element: " + ll);

		//14. Write a Java program to remove all the elements from a linked list. 
		ll.clear();
		System.out.println("LL after remove: " + ll);

		//15. Write a Java program of swap two elements in a linked list.
		Collections.swap(ll, 3, 4);
		System.out.println("LL after swape 4th and 5th element: " + ll);

		//16. Write a Java program to shuffle the elements in a linked list.
		Collections.shuffle(ll);
		System.out.println("LL after shuffle: " + ll);

		//17. Write a Java program to join two linked lists.
		LinkedList<String> ll2 = new LinkedList<String>();
		ll2.add("M");
		ll2.add("N");
		ll2.add("O");
		ll2.add("P");
		ll.addAll(ll2);
		System.out.println("LL after join another LL: " + ll);

		//18. Write a Java program to clone an linked list to another linked list. 
		LinkedList<String> ll3 = new LinkedList<String>();
		ll1.add("M");
		ll1.add("N");
		ll1.add("O");
		ll1.add("P");
		LinkedList<String> ll4 = new LinkedList<String>();
		System.out.println("LL First: " + ll3);
		System.out.println("LL second before clone: " + ll4);
		ll2 = (LinkedList<String>) ll1.clone();
		System.out.println("LL Second after clone: " + ll4);

		//19. Write a Java program to remove and return the first element of a linked list.
		System.out.println(ll.pollFirst());
		System.out.println(ll);

		//20-Write a Java program to retrieve but does not remove, the first element of a linked list.
		System.out.println("Retrieve the first element but does not remove: " + ll.peekFirst());
		System.out.println(ll);

		//21-Write a Java program to retrieve but does not remove, the last element of a linked list.
		System.out.println("Retrieve the last element but does not: " + ll.peekLast());
		System.out.println(ll);

		//22-Write a Java program to check if a particular element exists in a linked list.
		if (ll.contains("A"))
			System.out.println("We found A: ");
		else
			System.out.println("We didn't find A: ");

		//23- Write a Java program to convert a linked list to array list.
		ArrayList<String> al = new ArrayList<String>(ll);
		System.out.println(al);
		for (String item : al)
			System.out.print(item + " ");

		//24- Write a Java program to compare two linked lists.
		LinkedList<String> ll5 = new LinkedList<String>();
		ll1.add("A");
		ll1.add("B");
		ll1.add("C");
		ll1.add("D");
		ll1.add("E");
		ll1.add("F");
		ll1.add("G");
		ll1.add("H");
		ll1.add("I");
		ll1.add("J");
		ll1.add("K");
		ll1.add("L");
		System.out.println("Initial Second LL: " + ll5);
		if (ll.containsAll(ll5))
			System.out.println("Both LL are equal ");
		else
			System.out.println("both LL are not equal ");
		ll5.add("M");
		System.out.println("LL First: " + ll);
		System.out.println("LL Second: " + ll5);
		if (ll.containsAll(ll5))
			System.out.println("Both LL are equal ");
		else
			System.out.println("both LL are not equal ");

		//25. Write a Java program to test an linked list is empty or not.
		if (ll.isEmpty())
			System.out.println("LL is empty ");
		else
			System.out.println("LL is not empty ");
		ll.clear();
		System.out.println();

		if (ll.isEmpty())
			System.out.println("LL is empty ");
		else
			System.out.println("LL is not empty ");

		//26.Write a Java program to replace an element in a linked list.
		ll.set(4, "B");
		System.out.println();
	}
}
