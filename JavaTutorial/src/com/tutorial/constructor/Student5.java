package com.tutorial.constructor;

//Copying values without constructor
public class Student5 {
int id;
String name;
int rollNo;
Student5(int i, String n, int r)
	{
		id=i;
		name=n;
		rollNo=r;
	}
Student5()
	{
	}
void printData()
	{
		System.out.println(id+" "+name+" "+rollNo);
	}
public static void main(String[] args) {
	Student5 s1=new Student5(101, "Vinod Yadav", 97156);
	Student5 s2=new Student5();
	s2.id=s1.id;
	s2.name=s1.name;
	s2.rollNo=s1.rollNo;
	s1.printData();
	s2.printData();
}
}
