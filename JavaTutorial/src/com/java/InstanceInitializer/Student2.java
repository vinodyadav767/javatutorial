package com.java.InstanceInitializer;

//What is invoked first, instance initializer block or constructor?
public class Student2 {
int speed;
Student2()
	{
		System.out.println("Constructor Invoke");
	}
	{
		System.out.println("Instance initilizer Invoke");
	}
	public static void main(String[] args) {
		Student2 s=new Student2();
		Student2 s2=new Student2();
	}
}
