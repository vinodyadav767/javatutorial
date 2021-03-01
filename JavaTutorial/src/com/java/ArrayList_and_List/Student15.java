package com.java.ArrayList_and_List;

import java.util.ArrayList;

//Java ArrayList example to remove elements
public class Student15 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Vinod");
		al.add("Sohan");
		al.add("Satish");
		al.add("Saloni");
		al.add("Shreya");
		System.out.println("Initial List: " + al);
		al.remove("Satish");
		System.out.println("List after removing Satish: " + al);
		al.remove(1);
		System.out.println("Removing at postion 1: " + al);
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Avinash");
		al1.add("Addi");
		al1.add("Anand");
		al.addAll(al1);
		System.out.println("Updated List: " + al);
		al.removeAll(al1);
		System.out.println("remaining in List: " + al);
		al.removeIf(a -> a.contains("Vinod"));
		System.out.println("List after removing Vinod: " + al);
		al.clear();
		System.out.println("After removing everything: " + al);
	}
}
