package com.java.methodoverloading;

class S5
	{
		int add(int a, int b)
		{
			return a+b;
		}
		int add(int a, int b, int c)
		{
			return a+b+c;
		}
	}
public class Student5 {
public static void main(String[] args) {
	S5 s1=new S5();
	System.out.println(s1.add(10, 20));
	System.out.println(s1.add(10, 20, 30));
}
}
