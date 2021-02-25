package com.java.polymorphism;

//Java Runtime Polymorphism with Multilevel Inheritance

class Animal1 {
	void eat() {
		System.out.println("Animals are eating");
	}
}

class Dog1 extends Animal1 {
	void eat() {
		System.out.println("Dog is eating");
	}
}

class Babydog extends Dog1 {
	void eat() {
		System.out.println("Babydog is eating");
	}
}

public class Student6 {
	public static void main(String[] args) {
		Animal1 a;
		a = new Animal1();
		a.eat();
		a = new Dog1();
		a.eat();
		a = new Babydog();
		a.eat();
	}
}
