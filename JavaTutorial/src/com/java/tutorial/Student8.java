package com.java.tutorial;

public class Student8 {
	void fact(int a)
	{
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.println("The Factorial of No is "+a+" :"+fact);
	}
	public static void main(String[] args) {
		//Student8 s=new Student8();
		//s.fact(6);
		new Student8().fact(5);//Calling method through an anonymous object
	}
}
