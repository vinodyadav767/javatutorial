package com.java.thisKeyword;
//Calling parameterized constructor from default constructor:

public class Student4 {
Student4()
	{
		//this(10,15);
		this(5);
		System.out.println("Default Constructor");
	}
Student4(int x)
	{
		System.out.println("Single Parameterized Constructor");
	}
Student4(int a, int b)
	{
		System.out.println("Two parameterized Constructor and values: "+a+" "+b);
	}

public static void main(String[] args) {
	Student4 s1=new Student4();	
}

}
