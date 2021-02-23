package com.java.methodoverloading;

//Example of Method Overloading with Type Promotion in case of ambiguity
class S8
	{
		void add(int a, long b)
		{
			System.out.println(a+b);
		}
		void add(long a, int b)
		{
			System.out.println(a+b);
		}
	}
public class Student8 {
public static void main(String[] args) {
	S8 s1=new S8();
	//s1.add(10, 20);now ambiguity
	//s1.add(100, 10);now ambiguity
	//Output:Compile Time Error
}
}
