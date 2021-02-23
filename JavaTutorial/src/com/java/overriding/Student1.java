package com.java.overriding;

//Example of method overriding

class S1
	{
		void run()
		{
			System.out.println("Bike is running");
		}
	}
public class Student1 extends S1
{
	void run()
	{
		System.out.println("Bike is running safely");
	}
	public static void main(String[] args) {
		Student1 s1=new Student1();
		s1.run();
	}
}
