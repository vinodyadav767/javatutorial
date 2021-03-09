package com.java.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//How to convert List to Array
public class Student3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		System.out.println("List before converting into Array: " + list);
		String[] array = list.toArray(new String[list.size()]);
		System.out.println("Array from converting a List: " + Arrays.toString(array));
	}
}
