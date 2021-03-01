package com.java.accessmodifier;

//Java Access Modifiers with Method Overriding
class S6
	{
	protected void printData()
		{
			System.out.println("Default Access modifier overriding is working");
		}
	}
class S66 extends S6
	{
	 // void printData() The default modifier is more restrictive than protected. That is why, there is a compile-time error.
		{
			System.out.println("protected access modifire overriding is working");
		}
	}
public class Student6 {
	public static void main(String[] args) {
		S66 s66=new S66();
		s66.printData();
	}

}
