package com.java.ArrayList_and_List;

import java.util.ArrayList;

//Iterating ArrayList using For-each loop
public class Student3 {
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();
	list.add("Vinod");
	list.add("Sohan");
	list.add("Satish");
	list.add("Saloni");
	list.add("Shreya");
	for(String names:list)
	{
		System.out.println(names);
	}
}
}
