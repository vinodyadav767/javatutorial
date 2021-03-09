package com.java.List;

import java.util.ArrayList;
import java.util.List;

//Java List Example
public class Student1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		System.out.print("Initial List: ");
		for (String a : list)
			System.out.print(a + " ");
	}
}
