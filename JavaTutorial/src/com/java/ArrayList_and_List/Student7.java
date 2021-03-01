package com.java.ArrayList_and_List;

import java.util.ArrayList;
import java.util.ListIterator;

//Traversing list through List Iterator
public class Student7 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Vinod");
		list.add("Sohan");
		list.add("Satish");
		list.add("Saloni");
		list.add("Shreya");
		ListIterator<String> list1 = list.listIterator(list.size());
		while (list1.hasPrevious()) {
			String str = list1.previous();
			System.out.println(str);
		}
	}
}
