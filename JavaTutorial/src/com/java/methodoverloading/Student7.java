package com.java.methodoverloading;

//Example of Method Overloading with Type Promotion if matching found
class S7
	{
		void add(int a, int b)
		{
			System.out.println(a+b);
		}
		void add(long a, long b)
		{
			System.out.println(a+b);
		}
	}
public class Student7 {
public static void main(String[] args) {
	S7 s1=new S7();
	s1.add(10, 20);
	s1.add(20, 30);
}
}
