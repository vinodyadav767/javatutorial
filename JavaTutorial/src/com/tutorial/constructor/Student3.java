package com.tutorial.constructor;

public class Student3 {
	int id;
	String name;
	int age;
	Student3(int i, String n)
	{
		id=i;
		name=n;
	}
	Student3(int i, String n, int a)
	{
		id=i;
		name=n;
		age=a;
	}
	void print()
	{
		System.out.println(id+" "+name+" "+age);
	}
	public static void main(String[] args) {
		Student3 s1=new Student3(101, "Vinod");
		Student3 s2=new Student3(102, "Yadav", 18);
		s1.print();
		s2.print();
	}

}
