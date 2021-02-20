package com.java.staticVariable;

//Program of the counter without static variable
public class Student2 {
	int count=0;//will get memory each time when the instance is created 
	Student2()
	{
		count++;
		System.out.println(count);
	}
	public static void main(String[] args) {
		Student2 s1=new Student2();
		Student2 s2=new Student2();
		Student2 s3=new Student2();
	}
}
