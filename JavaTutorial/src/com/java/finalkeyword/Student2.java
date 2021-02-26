package com.java.finalkeyword;

//Example of final method
class S2
	{
		final void run()
		{
			System.out.println("Bike is running");
		}
	}
public class Student2 extends S2 
{
	 //void run() Compile Time Error
	{
		System.out.println("running child");
	}
	public static void main(String[] args) {
		Student2 s1=new Student2();
		s1.run();
	}
}
