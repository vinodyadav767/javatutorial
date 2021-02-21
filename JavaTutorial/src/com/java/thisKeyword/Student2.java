package com.java.thisKeyword;

//this: to invoke current class method
public class Student2 {
	void m()
	{
		System.out.println("Print m here");
	}
	void n()
	{
		System.out.println("Print n here");
		this.m();
	}
	public static void main(String[] args) {
		Student2 s1=new Student2();
		s1.n();
	}

}
