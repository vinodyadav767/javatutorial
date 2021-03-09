package com.java.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//How to Sort List
public class Student5 {
public static void main(String[] args) {
	List<String> list=new ArrayList<String>();
	list.add("Vinod");
	list.add("Sohan");
	list.add("Satish");
	System.out.println("List before sort: "+list);
	Collections.sort(list);
	System.out.println("List after sort: "+list);
	System.out.println();
	
	List<Integer> list1=new ArrayList<Integer>();
	list1.add(80);
	list1.add(70);
	list1.add(60);
	list1.add(40);
	list1.add(90);
	list1.add(30);
	list1.add(20);
	list1.add(100);
	list1.add(50);
	list1.add(10);
	System.out.println("List before sort: "+list1);
	Collections.sort(list1);
	System.out.println("List after sort: "+list1);
}
}
