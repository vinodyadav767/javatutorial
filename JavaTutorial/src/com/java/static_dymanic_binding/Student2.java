package com.java.static_dymanic_binding;

//Example of dynamic binding
class S2
	{
		void eating()
		{
			System.out.println("Dynamic binding in S2");
		}
	}
public class Student2 extends S2{
void eating()
	{
		System.out.println("Dynamic binding in Student2");
	}
public static void main(String[] args) {
	S2 s1=new Student2();
	s1.eating();
}
}
