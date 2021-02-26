package com.java.abstract_class;

//Abstract class having constructor, data member and methods
abstract class S4
	{
		abstract void run();
		S4()
		{
			System.out.println("Constructor is created");
		}
		void runMethod()
		{
			System.out.println("Method created with boday");
		}
	}
public class Student4 extends S4{
	void run()
	{
		System.out.println("Abstract method implimented in child class");
	}
	public static void main(String[] args) {
		S4 s1=new Student4();
		s1.run();
		s1.runMethod();
	}
}
