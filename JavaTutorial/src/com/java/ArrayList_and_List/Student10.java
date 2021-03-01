package com.java.ArrayList_and_List;

import java.util.ArrayList;
import java.util.Iterator;

//Traversing list through forEachRemaining() method
public class Student10 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Vinod");
		list.add("Sohan");
		list.add("Satish");
		list.add("Saloni");
		list.add("Shreya");
		Iterator<String> itr = list.iterator();
		itr.forEachRemaining(a -> {
			System.out.println(a);
		});
	}
}
