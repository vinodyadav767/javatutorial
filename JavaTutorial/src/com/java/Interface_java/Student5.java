package com.java.Interface_java;

//Java 8 Default Method in Interface
interface I5
	{
		void printData();
		default void printData1()
		{
			System.out.println("Default method is running");
		}
	}
class S5 implements I5
	{
		public void printData()
		{
			System.out.println("Printing is also working now");
		}
	}
public class Student5 {
public static void main(String[] args) {
	S5 s1=new S5();
	s1.printData();
	s1.printData1();
	System.out.println();
	I5 data;
	data=new S5();
	data.printData();
	data.printData1();
}
}
