package com.java.ArrayList_and_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

//Ways to iterate the elements of the collection in Java
public class Class11 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Vinod");
		list.add("Sohan");
		list.add("Satish");
		list.add("Saloni");
		list.add("Shreya");
		Collections.sort(list);
		//By while loop Iterator interface.
		System.out.println("Results By whiel loop Iterator interface");
		ListIterator<String> list1=list.listIterator(list.size());
		while(list1.hasPrevious())
		{
			String str=list1.previous();
			
			System.out.println(str);
		}
		//By for loop.
		System.out.println("Results By for loop");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		//By forEach() method.
		System.out.println("Results By forEach() method");
		list.forEach(a->
		{
			System.out.println(a);
		});
		//By forEachRemaining() method.
		System.out.println("results By forEachRemaining() method");
		Iterator<String> itr=list.iterator();
		itr.forEachRemaining(
				a->
				{
					System.out.println(a);
				});
	}
}
