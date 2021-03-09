package com.java.List;

import java.util.ArrayList;
import java.util.List;

//Get and Set Element in List
public class Student4 {
public static void main(String[] args) {
	List<Integer> list=new ArrayList<Integer>();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	list.add(50);
	list.add(60);
	System.out.println("An element from a spesific position before set: "+list.get(1));
	System.out.println("All the elements from the List before set: "+list);
	list.set(1, 70);
	System.out.println("All the elements from the List after set: "+list);
	System.out.print("All elements of List by for: ");
	for(int item:list)
		System.out.print(+item+" ");
}
}
