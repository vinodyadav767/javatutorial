package com.java.static_dymanic_binding;

//Example of static binding
public class Student1 {
	private void printData()
	{
		System.out.println("private Static binding");
	}
	final void printData1()
	{
		System.out.println("final static binding");
	}
	static void printData2()
	{
		System.out.println("static static binding");
	}
	public static void main(String[] args) {
		Student1 s1=new Student1();
		s1.printData();
		s1.printData1();
		//s1.printData2();
		Student1.printData2();
	}

}
