package com.java.superkeyword;

//Another example of super keyword where super() is provided by the compiler implicitly.
class Animal3 {
	Animal3() {
		System.out.println("Animal created");
	}
}

class Dog3 extends Animal3 {
	Dog3() {
		System.out.println("Dog is created");
	}
}

public class Student4 {
	public static void main(String[] args) {
		Dog3 d = new Dog3();
	}
}
