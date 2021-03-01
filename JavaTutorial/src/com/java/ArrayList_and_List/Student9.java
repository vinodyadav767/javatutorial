package com.java.ArrayList_and_List;

import java.util.ArrayList;

//Traversing list through forEach() method
public class Student9 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Vinod");
		list.add("Sohan");
		list.add("Satish");
		list.add("Saloni");
		list.add("Shreya");
		list.forEach(a -> {
			System.out.println(a);
		});
	}
}
