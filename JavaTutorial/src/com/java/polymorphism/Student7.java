package com.java.polymorphism;

//Try for Output
class Animal2 {
	void eat() {
		System.out.println("Animals are eating");
	}
}

class Dog2 extends Animal2 {
	void eat() {
		System.out.println("Dog is eating");
	}
}

public class Student7 extends Dog2 {
	public static void main(String[] args) {
		Animal2 a;
		a = new Student7();
		a.eat();
	}
}
