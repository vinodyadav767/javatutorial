package com.java.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//How to convert Array to List
public class Student2 {
public static void main(String[] args) {
	String[] array= {"A","B","C","D","E","F"};
	System.out.println("Array before converting to List: "+Arrays.toString(array));
	List<String> list=new ArrayList<String>();
	for(String item:array)
		list.add(item);
	System.out.println("Array after converting to List: "+list);
}
}
