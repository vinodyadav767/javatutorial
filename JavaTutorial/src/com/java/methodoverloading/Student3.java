package com.java.methodoverloading;

//Why Method Overloading is not possible by changing the return type of method only?
class S3
	{
		static int add(int a, int b, int c)
		{
			return a+b+c;
		}
		static int add(int a, int b)
		{
			return a+b;
		}
	}
public class Student3 
{
	public static void main(String[] args) {
		System.out.println(S3.add(10, 20, 30));
		System.out.println(S3.add(10, 20));
	}
}
