package com.java.methodoverloading;

//Method Overloading: changing data type of arguments
class S2
	{
		static int add(int a, int b, int c)
		{
			return a+b+c;
		}
		static double add(double a, double b, double c)
		{
			return a+b+c;
		}
	}
public class Student2 
{
	public static void main(String[] args) {
		System.out.println(S2.add(10, 20, 30));
		System.out.println(S2.add(15.5, 24.5, 10.0));
	}
}
