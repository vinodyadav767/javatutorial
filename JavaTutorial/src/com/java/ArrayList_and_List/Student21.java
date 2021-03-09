package com.java.ArrayList_and_List;

import java.util.ArrayList;

// We are starting from -protected void removeRange(int fromIndex, int toIndex)
public class Student21 extends ArrayList<Integer>{
public static void main(String[] args) {
	Student21 s1=new Student21();
	s1.add(1);
	s1.add(2);
	s1.add(3);
	s1.add(4);
	s1.add(5);
	s1.add(6);
	s1.add(7);
	s1.add(8);
	s1.add(9);
	s1.add(10);
	System.out.print("List of elements before removeRange: ");
	for(Integer i:s1)
		System.out.print(i+" ");
	System.out.println();
	s1.removeRange(0, 4);
	System.out.print("List of elements after removeRange: ");
	for(Integer i: s1)
		System.out.print(i+" ");
}
}
