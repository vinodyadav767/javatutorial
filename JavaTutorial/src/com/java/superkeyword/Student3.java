package com.java.superkeyword;

//super is used to invoke parent class constructor.
class Animal2
	{
	Animal2()
	{
		System.out.println("Animal is created");
	}
	}
class Dog2 extends Animal2
	{
		Dog2()
		{
			super();
			System.out.println("Dog created");
		}
	}
public class Student3 {
	public static void main(String[] args) {
	Dog2 d=new Dog2();	
	}
}
