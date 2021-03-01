package com.java.ArrayList_and_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

//Exaple All of ArrayList and List
public class Student20 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Vinod");
		al.add("Sohan");
		al.add("Satish");
		al.add("Saloni");
		al.add("Shreya");
		System.out.println("Orinigal ArrayList: " + al);
		System.out.println();

		// void add(int index, E element) It is used to insert the specified element at
		// the specified position in a list.
		al.add(1, "Ansh");
		System.out.println("ArrayList after adding Ansh at 1 Position: " + al);
		System.out.println();

		// boolean add(E e) It is used to append the specified element at the end of a
		// list.
		al.add("Shaumya");
		System.out.println("ArrayList after adding Shaumya at end Position" + al);
		System.out.println();

		// boolean addAll(Collection<? extends E> c) It is used to append all of the
		// elements in the specified collection to the end of this list, in the order
		// that they are returned by the specified collection's iterator.
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Avinash");
		al1.add("Addi");
		al1.add("Anand");
		System.out.println("Original Second ArrayList: " + al1);
		al.addAll(al1);
		System.out.println("ArrayList after add Second ArrayList: " + al);
		System.out.println();

		// boolean addAll(int index, Collection<? extends E> c) It is used to append all
		// the elements in the specified collection, starting at the specified position
		// of the list.
		al.addAll(0, al1);
		System.out.println("Adding second ArrayList at 0 postion: " + al);
		System.out.println();

		// void ensureCapacity(int requiredCapacity) It is used to enhance the capacity
		// of an ArrayList instance.
		al.ensureCapacity(5000);
		System.out.println("Now First ArrayList can store upto 500 elemenst");
		System.out.println();

		// E get(int index) It is used to fetch the element from the particular position
		// of the list.
		System.out.println(al.get(0) + " " + al.get(1));
		System.out.println();

		// boolean isEmpty() It returns true if the list is empty, otherwise false.
		System.out.println("Is Second ArrayList Emplty: ");
		System.out.println(al1.isEmpty());
		System.out.println();

		// void clear() It is used to remove all of the elements from this list.
		al1.clear();
		System.out.println("Second ArrayList after clear: " + al1);
		System.out.println();

		// boolean isEmpty() It returns true if the list is empty, otherwise false.
		System.out.println("Is Second ArrayList Emplty: ");
		System.out.println(al1.isEmpty());
		System.out.println();

		// Iterator()`
		ArrayList<String> nal = new ArrayList<String>();
		nal.add("A");
		nal.add("B");
		nal.add("C");
		nal.add("D");
		nal.add("E");
		Iterator itr = nal.iterator();
		System.out.println("Iterator elements: ");
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		System.out.println();

		// listIterator()
		ListIterator itr1 = nal.listIterator();
		System.out.println("ListIterator elements in forwaord direction :");
		while (itr1.hasNext()) {
			System.out.print(itr1.next() + " ");
		}
		System.out.println();
		System.out.println();

		System.out.println("ListIterator elements in backword direction :");
		while (itr1.hasPrevious()) {
			System.out.print(itr1.previous() + " ");
		}
		System.out.println();
		System.out.println();

		// int lastIndexOf(Object o) It is used to return the index in this list of the
		// last occurrence of the specified element, or -1 if the list does not contain
		// this element.

		ArrayList<Integer> ali = new ArrayList<Integer>();
		ali.add(10);
		ali.add(20);
		ali.add(30);
		ali.add(40);
		ali.add(50);
		int ele = ali.lastIndexOf(20);
		if (ele != -1) {
			System.out.println("Last Index of 20 is: " + ele);
		} else {
			System.out.println("20 is not available in list");
		}
		int ele1 = ali.lastIndexOf(30);
		if (ele1 != -1) {
			System.out.println("Last Index of 30 is: " + ele1);
		} else {
			System.out.println("30 is not available in the list");
		}
		ali.add(20);
		ali.add(30);
		int ele20 = ali.lastIndexOf(20);
		if (ele != -1) {
			System.out.println("Last Index of 20 is: " + ele20);
		} else {
			System.out.println("20 is not available in list");
		}
		int ele30 = ali.lastIndexOf(30);
		if (ele1 != -1) {
			System.out.println("Last Index of 30 is: " + ele30);
		} else {
			System.out.println("30 is not available in the list");
		}
		System.out.println();

		// Object[] toArray() It is used to return an array containing all of the
		// elements in this list in the correct order.
		Object[] obj = ali.toArray();
		for (Object num : obj)
			System.out.print(num + " ");
		System.out.println();
		System.out.println();

		// <T> T[] toArray(T[] a) It is used to return an array containing all of the
		// elements in this list in the correct order.
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		System.out.println("Elements in arraylist: " + arr);
		Object[] arr1 = arr.toArray();
		System.out.println("Elements of ArrayList" + "as Array: " + Arrays.toString(arr1));
		System.out.println();

		// Object clone() It is used to return a shallow copy of an ArrayList.
		ArrayList<String> ar11 = new ArrayList<String>();
		ar11.add("Vinod");
		ar11.add("Sohan");
		ar11.add("Satish");
		ar11.add("Saloni");
		ar11.add("Shreya");
		System.out.println("ArrayList elemenets before clone: " + ar11);
		ArrayList ar12 = new ArrayList();
		ar12 = (ArrayList) ar11.clone();
		System.out.println("ArrayList elements after clone: " + ar12);
		System.out.println();

		// boolean contains(Object o) It returns true if the list contains the specified
		// element
		ArrayList<Integer> ai11 = new ArrayList<Integer>();
		ai11.add(10);
		ai11.add(20);
		ai11.add(30);
		ai11.add(40);
		ai11.add(50);
		if (ai11.contains(30)) {
			System.out.println("The ArrayList contains 30: ");
		} else {
			System.out.println("There is no 30:");
		}
		System.out.println();

		// int indexOf(Object o) It is used to return the index in this list of the
		// first occurrence of the specified element, or -1 if the List does not contain
		// this element.
		System.out.print("The elements of List: ");
		for (Integer i : ai11)
			System.out.print(i + " ");
		System.out.println();
		int pos = ai11.indexOf(40);
		System.out.print("Index  of 40 is : " + pos);
		System.out.println();
		System.out.println();

		// E remove(int index) It is used to remove the element present at the specified
		// position in the list.
		System.out.print("List of elements before remove: ");
		for (Integer i : ai11)
			System.out.print(i + " ");
		ai11.remove(2);
		System.out.println();
		System.out.print("List of elements after remove: ");
		for (Integer i : ai11)
			System.out.print(i + " ");
		System.out.println();
		System.out.println();
		
		//boolean remove(Object o)	It is used to remove the first occurrence of the specified element.
		ArrayList<Double> dal=new ArrayList<Double>();
		dal.add(10.5);
		dal.add(15.5);
		dal.add(25.40);
		dal.add(40.60);
		dal.add(100.0);
		System.out.print("List of elements before remove: ");
		for(Double d: dal)
			System.out.print(d+" ");
		double ritem=25.40;
		dal.remove(ritem);
		System.out.println();
		System.out.print("Lists of elements after remove: ");
		for(double d: dal)
			System.out.print(d+" ");
	}}
