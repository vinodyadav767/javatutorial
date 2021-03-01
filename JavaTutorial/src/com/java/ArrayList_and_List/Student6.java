package com.java.ArrayList_and_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//How to Sort ArrayList
public class Student6 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Vinod");
		list.add("Sohan");
		list.add("Satish");
		list.add("Saloni");
		list.add("Shreya");
		System.out.println("Before sorting: ");
		for (String names : list)
			System.out.println(names);
		System.out.println("After sorting: ");
		Collections.sort(list);
		for (String snames : list)
			System.out.println(snames);
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(50);
		list1.add(5);
		list1.add(100);
		list1.add(15);
		System.out.println("List before sort: ");
		for (int num : list1)
			System.out.println(num);
		System.out.println("List after sort: ");
		Collections.sort(list1);
		for (int snum : list1)
			System.out.println(snum);

	}
}
