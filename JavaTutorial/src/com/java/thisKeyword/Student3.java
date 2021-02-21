package com.java.thisKeyword;

//this() : to invoke current class constructor
public class Student3 {
Student3()
	{
		System.out.println("Default constracutor");
	}
Student3(int x)
	{
		this();
		System.out.println(x);
	}
public static void main(String[] args) {
	Student3 s1=new Student3(10);
}
}
