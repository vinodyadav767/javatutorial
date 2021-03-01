package com.java.ArrayList_and_List;

import java.util.ArrayList;

//Traversing list through for loop
public class Student8 {
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();
	list.add("Vinod");
	list.add("Sohan");
	list.add("Satish");
	list.add("Saloni");
	list.add("Shreya");
	for(int i=0;i<list.size();i++)
	{
		System.out.println(list.get(i));
	}
}
}
