package com.java.ArrayList_and_List;

import java.util.ArrayList;

//Get and Set ArrayList
public class Student4 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Vinod");
		list.add("Sohan");
		list.add("Satish");
		list.add("Saloni");
		list.add("Shreya");
		System.out.println("Getting Second element: "+list.get(2));
		System.out.println("Before Set: ");
		for(String names:list)
		{
			System.out.println(names);
		}
		list.set(3, "Shaumya");
		System.out.println();
		System.out.println("After Set at 3rd postion: ");
		for(String names:list)
		{
			System.out.println(names);
		}
		
	}

}
