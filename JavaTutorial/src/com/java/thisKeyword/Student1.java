package com.java.thisKeyword;
//Understanding the problem with this keyword
public class Student1 {
	int id;
	String name;
	double fee;
	Student1(int id, String name, double fee)
	{
		this.id=id;
		this.name=name;
		this.fee=fee;
	}
	void printData()
	{
		System.out.println(id+" "+name+" "+fee);
	}
	public static void main(String[] args) {
		Student1 s1=new Student1(101, "Yadav", 150000);
		Student1 s2=new Student1(102, "Yadav", 2000000);
		s1.printData();
		s2.printData();
	}
}
