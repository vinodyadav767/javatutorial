package com.java.inheritance;

//Single Inheritance Example
class Boy
	{
		void paly()
		{
			System.out.println("Playing");
		}
	}
public class Student2 extends Boy {
	void study()
	{
		System.out.println("Studying");
	}
	public static void main(String[] args) {
		Student2 s1=new Student2();
		s1.paly();
		s1.study();
	}
}
