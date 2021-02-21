package com.java.inheritance;
class S1
	{
	double salary=40000;
	}

public class Student1 extends S1 {
double bonus=10000;
public static void main(String[] args) {
	Student1 s1=new Student1();
	System.out.println("Salary: "+s1.salary);
	System.out.println("Bonus: "+s1.bonus);
}
}
