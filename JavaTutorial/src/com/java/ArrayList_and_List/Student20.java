package com.java.ArrayList_and_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.UnaryOperator;


//Need to do
//void sort(Comparator<? super E> c)	It is used to sort the elements of the list on the basis of specified comparator.
//void replaceAll(UnaryOperator<E> operator)	It is used to replace all the elements from the list with the specified element.

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

		// void add(int index, E element) It is used to insert the specified element at the specified position in a list.
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

		// E get(int index) It is used to fetch the element from the particular position of the list.
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

		// Object[] toArray() It is used to return an array containing all of the elements in this list in the correct order.
		Object[] obj = ali.toArray();
		for (Object num : obj)
			System.out.print(num + " ");
		System.out.println();
		System.out.println();

		// <T> T[] toArray(T[] a) It is used to return an array containing all of th elements in this list in the correct order.
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

		// boolean contains(Object o) It returns true if the list contains the specified element
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

		// int indexOf(Object o) It is used to return the index in this list of the first occurrence of the specified element, or -1 if the List does not contain this element.
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

		// boolean remove(Object o) It is used to remove the first occurrence of the
		// specified element.
		ArrayList<Double> dal = new ArrayList<Double>();
		dal.add(10.5);
		dal.add(15.5);
		dal.add(25.40);
		dal.add(40.60);
		dal.add(100.0);
		System.out.print("List of elements before remove: ");
		for (Double d : dal)
			System.out.print(d + " ");
		double ritem = 25.40;
		dal.remove(ritem);
		System.out.println();
		System.out.print("Lists of elements after remove: ");
		for (double d : dal)
			System.out.print(d + " ");
		System.out.println();
		System.out.println();
		// boolean removeAll(Collection<?> c) It is used to remove all the elements from
		// the list.
		ArrayList<Integer> al22 = new ArrayList<Integer>();
		al22.add(10);
		al22.add(20);
		al22.add(30);
		al22.add(40);
		al22.add(50);
		System.out.print("First List of elements before removing all from second List: ");
		for (Integer i : al22)
			System.out.print(i + " ");
		System.out.println();
		ArrayList<Integer> al33 = new ArrayList<Integer>();
		al33.add(10);
		al33.add(20);
		al33.add(50);
		System.out.print("Second List of elements: ");
		for (Integer i : al33)
			System.out.print(i + " ");
		System.out.println();
		al22.removeAll(al33);
		System.out.print("First List of elements after remove all from Second List: ");
		for (Integer i : al22)
			System.out.print(i + " ");
		System.out.println();
		System.out.print("Second List still same after removing from first List: ");
		for (Integer i : al33)
			System.out.print(i + " ");
		System.out.println();
		System.out.println();

		// boolean removeIf(Predicate<? super E> filter) It is used to remove all the
		// elements from the list that satisfies the given predicate.
		ArrayList<Integer> al44 = new ArrayList<Integer>();
		al44.add(10);
		al44.add(20);
		al44.add(30);
		al44.add(40);
		al44.add(50);
		al44.add(80);
		al44.add(90);
		al44.add(100);
		System.out.print("List of elements before removeIf: ");
		for (Integer i : al44)
			System.out.print(i + " ");
		System.out.println();
		al44.removeIf(a -> (a % 3 == 0));
		System.out.print("List of elements after removeIf: ");
		for (Integer i : al44)
			System.out.print(i + " ");
		al44.removeIf(a -> a % 4 == 0);
		System.out.println();
		System.out.print("List after anothe removeIf: ");
		for (Integer i : al44)
			System.out.print(i + " ");
		System.out.println();
		System.out.println();

		// void retainAll(Collection<?> c) It is used to retain all the elements in the
		// list that are present in the specified collection.
		ArrayList<String> gb = new ArrayList<String>();
		gb.add("Pen");
		gb.add("Pencil");
		gb.add("Cutter");
		gb.add("Eraser");
		System.out.print("List of gb elements before retainAll:");
		for (String s : gb)
			System.out.print(s + " ");
		System.out.println();
		ArrayList<String> bag = new ArrayList<String>();
		bag.add("Book");
		bag.add("Pen");
		bag.add("Botale");
		bag.add("Pencil");
		System.out.print("list of Bag elements before retainAll: ");
		for (String s : bag)
			System.out.print(s + " ");
		System.out.println();
		bag.retainAll(gb);
		System.out.print("List of gb elemenst after retainAll: ");
		for (String s : gb)
			System.out.print(s + " ");
		System.out.println();
		System.out.print("List of Bag elemenst after reatinAll: ");
		for (String s : bag)
			System.out.print(s + " ");
		System.out.println();
		System.out.println();

		// E set(int index, E element) It is used to replace the specified element in
		// the list, present at the specified position.
		ArrayList<Integer> al55 = new ArrayList<Integer>();
		al55.add(1);
		al55.add(2);
		al55.add(3);
		al55.add(4);
		al55.add(5);
		System.out.print("List of elements before set an elemenst: ");
		for (int i : al55)
			System.out.print(i + " ");
		System.out.println();
		int a = al55.set(3, 10);
		System.out.print("List of elements after set an elemenst: ");
		for (int i : al55)
			System.out.print(i + " ");
		System.out.println();
		System.out.print("Replaced elemenst is: " + a);
		System.out.println();
		System.out.println();
		
		//Spliterator<E> spliterator()	It is used to create spliterator over the elements in a list.
		ArrayList<String> al66=new ArrayList<String>();
		al66.add("vy@utb.cz");
		al66.add("sy@obd.hu");
		al66.add("sy@ies.com");
		Spliterator<String> emails=al66.spliterator();
		System.out.print("List of emails:--> ");
		emails.forEachRemaining(n->System.out.print(n+" "));
		System.out.println();
		System.out.println();
		
		//List<E> subList(int fromIndex, int toIndex)It is used to fetch all the elements lies within the given range.
			ArrayList<String> al77=new ArrayList<String>();
			al77.add("A");
			al77.add("B");
			al77.add("C");
			al77.add("D");
			al77.add("E");
			al77.add("F");
			System.out.print("Elemenst of First List: ");
			for(String s:al77)
				System.out.print(s+" ");
			System.out.println();
			List<String> subList=al77.subList(1, 4);
			System.out.print("Elements of subList: ");
			for(String s: subList)
				System.out.print(s+" ");
			System.out.println();
			System.out.println();
			
			//int size()	It is used to return the number of elements present in the list.
			ArrayList<Integer> al88=new ArrayList<Integer>();
			al88.add(1);
			al88.add(2);
			al88.add(3);
			al88.add(4);
			al88.add(5);
			System.out.print("List before operation: ");
			for(int i=0; i<al88.size();i++)
				System.out.print(al88.get(i)+" ");
			System.out.println();
			int si=al88.size();
			System.out.print("Size of list is: "+si);
			System.out.println();
			System.out.println();
			
			//void trimToSize()	It is used to trim the capacity of this ArrayList instance to be the list's current size.
			
			ArrayList<Integer> al99=new ArrayList<Integer>();
			al99.add(1);
			al99.add(2);
			al99.add(3);
			al99.add(4);
			al99.add(5);
			al99.add(6);
			al99.add(7);
			al99.add(8);
			al99.add(9);
			al99.add(10);
			System.out.print("List of elements before trimToSize: ");
			for(int i: al99)
				System.out.print(i+" ");
			System.out.println();
			al99.trimToSize();
			al99.add(11);
			System.out.print("List of elements after trimToSize: ");
			for(int i: al99)
				System.out.print(i+" ");
			System.out.println();
			
	}
}
