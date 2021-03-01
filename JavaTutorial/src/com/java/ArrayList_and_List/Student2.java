package com.java.ArrayList_and_List;

import java.util.ArrayList;
import java.util.Iterator;
//Iterating ArrayList using Iterator
public class Student2 {
	public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();
	list.add("Vinod");
	list.add("Sohan");
	list.add("Satish");
	list.add("Saloni");
	list.add("Shreya");
	Iterator itr=list.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	}
}
