package com.java.InstanceInitializer;

//
public class Student1 {
	int speed;
	Student1()
	{
		System.out.println("The speed is: "+speed);
	}
	{
		speed=100;
	}
	public static void main(String[] args) {
		Student1 s1=new Student1();
		Student1 s2=new Student1();
		Student1 s3=new Student1();
	}
}
