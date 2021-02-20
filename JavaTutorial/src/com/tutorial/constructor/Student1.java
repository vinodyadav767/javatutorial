package com.tutorial.constructor;

//Example of default constructor that displays the default values
public class Student1 {
int id;
String name;
void printData()
	{
		System.out.println(id+" "+name);
	}
public static void main(String[] args) {
	Student1 s=new Student1();
	s.printData();
}
}
