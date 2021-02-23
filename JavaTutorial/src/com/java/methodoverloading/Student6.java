package com.java.methodoverloading;

//Example of Method Overloading with TypePromotion
class S6
	{
		void add(int a, long b)
		{
			System.out.println(a+b);
		}
		void add(int a, int b, int c)
		{
			System.out.println(a+b+c);
		}
	}
public class Student6 {
public static void main(String[] args) {
	S6 s1= new S6();
	s1.add(10, 20);
	s1.add(10, 10, 20);
			
}
}
