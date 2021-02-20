package com.tutorial.constructor;

//Example of parameterized constructor
public class Student2 {
int id;
String name;
Student2(int i, String n)
	{
		id=i;
		name=n;
	}
void printData() 
	{
		System.out.println(id+" "+name);
	}
public static void main(String[] args) {
	Student2 s1=new Student2(101, "Vinod Yadav");
	Student2 s2=new Student2(102, "Sohan Yadav");
	s1.printData();
	s2.printData();
	
}
}
