package com.java.finalkeyword;

// Is final method inherited?
class S4
	{
		final void run()
		{
			System.out.println("final method is running");
		}
	}
public class Student4 extends S4
{
	public static void main(String[] args) {
		Student4 s1=new Student4();
		s1.run();
	}
}
