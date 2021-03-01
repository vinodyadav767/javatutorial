package com.java.ArrayList_and_List;

import java.util.ArrayList;
import java.util.Collections;

//How to Sort ArrayList
public class Student5 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Vinod");
		list.add("Sohan");
		list.add("Satish");
		list.add("Saloni");
		list.add("Shreya");
		for(String name:list)
		System.out.println(name);
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(20);
		list1.add(10);
		list1.add(50);
		list1.add(30);
		list1.add(100);
		Collections.sort(list1);
		for(int a: list1)
			System.out.println(a);
		
	}

}
