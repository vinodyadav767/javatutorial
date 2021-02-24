package com.java.InstanceInitializer;

//Another example of instance block
class A1 {
	A1() {
		System.out.println("Parent class constructor invoke");
	}
}

class B1 extends A1 {
	B1() {
		super();
		System.out.println("Chile class constructor invoke");
	}

	B1(int a) {
		super();
		System.out.println("Chile class constructor invoke with parameter: " + a);
	}

	{
		System.out.println("Instance Initilizer Invoke ");
	}
}

public class Student4 {
	public static void main(String[] args) {
		B1 b1 = new B1();
		B1 b2 = new B1(10);
	}
}
