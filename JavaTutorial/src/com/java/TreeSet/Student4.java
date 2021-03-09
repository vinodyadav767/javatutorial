package com.java.TreeSet;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.TreeSet;

//All the methods of TreeSet:
class The_Comparator  implements Comparator<String>
	{
		public int compare(String s1, String s2)
		{
			String first_str;
			String second_str;
			first_str=s1;
			second_str=s2;
			return second_str.compareTo(first_str);
		}
	}
class S4
	{
	public static void main(String[] args) {
//Comparator<? super E> comparator()	It returns comparator that arranged elements in order.
		TreeSet<String> ts1=new TreeSet<String>(new The_Comparator());
		ts1.add("G");
		ts1.add("E");
		ts1.add("E");
		ts1.add("K");
		ts1.add("S");
		ts1.add("4");
		System.out.println("TreeSet: "+ts1);
	}	
	}
public class Student4 {
	public static void main(String[] args) {
		// boolean add(E e) It is used to add the specified element to this set if it is not already present.
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("A");
		ts.add("B");
		ts.add("P");
		ts.add("S");
		ts.add("Q");
		ts.add("T");
		ts.add("R");
		ts.add("E");
		ts.add("C");
		ts.add("G");
		System.out.println("Initial TreeSet: " + ts);
		System.out.println();

		// boolean addAll(Collection<? extends E> c) It is used to add all of the elements in the specified collection to this set.
		System.out.println("TreeSet before adding all: " + ts);
		TreeSet<String> ts1 = new TreeSet<String>();
		ts1.add("D");
		ts1.add("F");
		ts1.add("H");
		ts.addAll(ts1);
		System.out.println("TreeSet Second: " + ts1);
		System.out.println("TreeSet after adding all: " + ts);
		System.out.println();

		// E ceiling(E e) It returns the equal or closest greatest element of the specified element from the set, or null there is no such element.
		System.out.println("TreeSet: " + ts);
		System.out.println("Trying to find P: " + ts.ceiling("P"));
		System.out.println("Trying to find I:" + ts.ceiling("I"));
		System.out.println("Trying to find U: " + ts.ceiling("U"));
		System.out.println();

		// Iterator descendingIterator() It is used iterate the elements in descending order.
		System.out.println("TreeSet before descendingIterator: " + ts);
		System.out.print("TreeSet after descendingIterator: ");
		Iterator itr = ts.descendingIterator();
		while (itr.hasNext())
			System.out.print(itr.next() + " ");
		System.out.println();
		System.out.println();

		// NavigableSet descendingSet() It returns the elements in reverse order.
		System.out.println("TreeSet before descendingSet: " + ts);
		System.out.println("TreeSet after descendingSet: " + ts.descendingSet());
		System.out.println();

		// E floor(E e) It returns the equal or closest least element of the specified element from the set, or null there is no such element.
		System.out.println("TreeSet: " + ts);
		System.out.println("Trying to find Q from TS: " + ts.floor("Q"));
		System.out.println("Trying to find I from TS: " + ts.floor("I"));
		System.out.println("Trying to find U from TS: " + ts.floor("U"));
		System.out.println("Trying to find Z from TS: " + ts.floor("Z"));
		System.out.println();

		// SortedSet headSet(E toElement) It returns the group of elements that are less than the specified element.
		System.out.println("TreeSet: " + ts);
		System.out.println("Set Head at G in TreeSet:  " + ts.headSet("G"));
		System.out.println("Set Head at E in TreeSet: " + ts.headSet("E"));
		System.out.println("Set Head at P in TreeSet: " + ts.headSet("P"));
		System.out.println();

		// NavigableSet headSet(E toElement, boolean inclusive) It returns the group of elements that are less than or equal to(if, inclusive is true) the specified element.
		System.out.println("TreeSet: " + ts);
		System.out.println("Set Heat at Q: " + ts.headSet("Q", false));
		System.out.println("Set Heat at Q: " + ts.headSet("Q", true));
		System.out.println("Set Heat at G: " + ts.headSet("G", false));
		System.out.println("Set Heat at G: " + ts.headSet("G", true));
		System.out.println();

		// E higher(E e) It returns the closest greatest element of the specified element from the set, or null there is no such element.
		System.out.println("TreeSet: " + ts);
		System.out.println("TreeSet after higher at H: " + ts.higher("H"));
		System.out.println("TreeSet after higher at I: " + ts.higher("I"));
		System.out.println("TreeSet after higher at T: " + ts.higher("T"));
		System.out.println();

		// Iterator iterator() It is used to iterate the elements in ascending order.
		System.out.println("TreeSet: " + ts);
		System.out.print("Elelemts of TreeSet by Iterator: ");
		Iterator itr1 = ts.iterator();
		while (itr1.hasNext())
			System.out.print(itr1.next() + " ");
		System.out.println();
		System.out.println();

		// E lower(E e) It returns the closest least element of the specified element from the set, or null there is no such element.
		System.out.println("TreeSet: " + ts);
		System.out.println("Element of TS with lower of P: " + ts.lower("P"));
		System.out.println("Element of TS with lower of Z: " + ts.lower("Z"));
		System.out.println("Element of TS with lower of Q: " + ts.lower("Q"));
		System.out.println();

		// E pollFirst() It is used to retrieve and remove the lowest(first) element.
		System.out.println("TrreSet before pollFirst: " + ts);
		System.out.println("Elemet of TS using pollFirst: " + ts.pollFirst());
		System.out.println("TreeSet after pollFirst: " + ts);
		System.out.println();

		// E pollLast() It is used to retrieve and remove the highest(last) element.
		System.out.println("TreeSet before polllast: " + ts);
		System.out.println("Elemet of TS using pollLast: " + ts.pollLast());
		System.out.println("TreeSet after pollLast: " + ts);
		System.out.println();

		// Spliterator spliterator() It is used to create a late-binding and fail-fastspliterator over the elements.
		System.out.println("TreeSet: " + ts);
		Spliterator<String> sp = ts.spliterator();
		System.out.print("All the elemenst of TS by spliterator: ");
		sp.forEachRemaining(a -> System.out.print(a + " "));
		// sp.forEachRemaining(System.out::println);
		System.out.println();
		System.out.println();

		// SortedSet subSet(E fromElement, E toElement)) It returns a set of elements that lie between the given range which includes fromElement and excludes toElement.
		System.out.println("TreeSet: " + ts);
		System.out.println("SubTreeSet SortedSet subSet: " + ts.subSet("D", "P"));
		System.out.println("SubTreeSet SortedSet subSet: " + ts.subSet("C", "R"));
		System.out.println();

		// NavigableSet subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive) It returns a set of elements that lie between the given range.
		System.out.println("TreeSet: " + ts);
		System.out.println("SubTreeSet NavigableSet subSet: " + ts.subSet("E", false, "P", true));
		System.out.println("SubTreeSet NavigableSet subSet: " + ts.subSet("D", true, "R", false));
		System.out.println();

		// SortedSet tailSet(E fromElement) It returns a set of elements that are greater than or equal to the specified element.
		System.out.println("TreeSet: " + ts);
		System.out.println("SortedSet tailSet: " + ts.tailSet("E"));
		System.out.println("SortedSet tailSet: " + ts.tailSet("P"));
		System.out.println();

		// NavigableSet tailSet(E fromElement, boolean inclusive) It returns a set of elements that are greater than or equal to (if, inclusive is true) the specified element.
		System.out.println("TreeSet: " + ts);
		System.out.println("NavigableSet tailSet: " + ts.tailSet("E", false));
		System.out.println("NavigableSet tailSet: " + ts.tailSet("E", true));
		System.out.println();

		// boolean contains(Object o) It returns true if this set contains the specified element.
		if (ts.contains("H"))
			System.out.println("We found H");
		else
			System.out.println("We didn't find H");
		System.out.println();

		TreeSet<String> ts2 = new TreeSet<String>();
		ts2.add("P");
		ts2.add("Q");
		ts2.add("R");
		System.out.println("TS First: " + ts);
		System.out.println("TS First: " + ts2);
		if (ts.containsAll(ts2))
			System.out.println("All the elements of TS second contains into TS First ");
		else
			System.out.println("All the elements of TS second does not contains into TS First ");

		System.out.println();

		ts2.add("Z");
		System.out.println("TS First: " + ts);
		System.out.println("TS First: " + ts2);
		if (ts.containsAll(ts2))
			System.out.println("All the elements of TS second contains into TS First ");
		else
			System.out.println("All the elements of TS second does not contains into TS First ");
		ts2.add("Z");
		System.out.println();

		// boolean isEmpty() It returns true if this set contains no elements.
		System.out.println("TreeSet Second: " + ts2);
		if (ts2.isEmpty())
			System.out.println("TreeSet second is empty ");
		else
			System.out.println("TreeSet second is not empty ");
		System.out.println();

		System.out.println("TreeSet before clear: " + ts2);
		ts2.clear();
		System.out.println("TreeSet after clear: " + ts2);
		if (ts2.isEmpty())
			System.out.println("TreeSet is empty now: ");
		else
			System.out.println("TreeSet is not empty now: ");
		System.out.println();

		// boolean remove(Object o) It is used to remove the specified element from this set if it is present.
		System.out.println("TreeSet before remove P: " + ts);
		ts.remove("P");
		System.out.println("TreeSet after remove P: " + ts);
		System.out.println();

		TreeSet<String> ts3 = new TreeSet<String>();
		ts3.add("C");
		ts3.add("D");
		ts3.add("E");
		System.out.println("TreeSet First: " + ts);
		System.out.println("TreeSet Second: " + ts3);
		if (ts.removeAll(ts3))
			System.out.println("All the element of TS Second has been removed from TS First");
		else
			System.out.println("All elements of TS second deos not belongs to TS First ");
		System.out.println();
		System.out.println("Updated TreeSet: " + ts);
		ts3.clear();
		System.out.println();

		// Object clone() It returns a shallow copy of this TreeSet instance.

		System.out.println("TreeSet First before clone: " + ts);
		System.out.println("TreeSet Second before clone: " + ts3);
		ts3 = (TreeSet<String>) ts.clone();
		System.out.println("TreeSet Second after clone: " + ts3);
		System.out.println();

		// E first() It returns the first (lowest) element currently in this sorted set.
		System.out.println("TreeSet: " + ts3);
		System.out.println("First element of TreeSert: " + ts3.first());
		System.out.println("Last element of TreeSet: " + ts3.last());
		System.out.println();

		// int size() It returns the number of elements in this set.
		System.out.println("TreeSet: " + ts3);
		System.out.println("Size of TreeSet: " + ts3.size());

	}
}
