package com.java.finalkeyword;

//Java final variable

public class Student1 {
	final int speedLimit=90;
	void changeSpeed()
	{
		// speedLimit=120; 
		//Compile Time Error
		//There is a final variable speedlimit, we are going to change the value of this variable, but It can't be changed because final variable once assigned a value can never be changed.
	}
public static void main(String[] args) {
	Student1 s1=new Student1();
	s1.changeSpeed();
}
}
