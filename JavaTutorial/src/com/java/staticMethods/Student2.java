package com.java.staticMethods;

public class Student2 {
	 static int cube(int a)
	{
		return a*a*a;
		
	}
public static void main(String[] args) {
	int results=Student2.cube(5);
	System.out.println(results);
}
}
