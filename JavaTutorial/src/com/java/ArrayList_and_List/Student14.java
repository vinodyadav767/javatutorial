package com.java.ArrayList_and_List;

import java.util.ArrayList;

//Java ArrayList example to add elements
public class Student14 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Initaily ArrayList" + al);
		al.add("Vinod");
		al.add("Sohan");
		al.add("Satish");
		al.add("Saloni");
		al.add("Shreya");
		System.out.println("List after adding it: " + al);
		al.add(4, "Ansh");
		System.out.println("List after adding at spesific postion" + al);
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Shaumya");
		al1.add("Babby");
		al.addAll(al1);
		// al1.addAll(al);
		System.out.println("List after adding a lit:" + al);
		// System.out.println("List after adding a lit:"+al1);
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Avinash");
		al2.add("Addi");
		al.addAll(1, al2);
		System.out.println("Addind a list at spesific postion: " + al);

	}
}
