package com.java.InstanceInitializer;

//Program of instance initializer block that is invoked after super()
class A {
	A() {
		System.out.println("Parent class constructor");
	}
}

class B extends A {
	B() {
		super();
		System.out.println("Chile class constructor");
	}

	{
		System.out.println("instance Initializer");
	}
}

public class Student3 {
	public static void main(String[] args) {
		B b = new B();
	}
}
