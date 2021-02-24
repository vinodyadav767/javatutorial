package com.java.superkeyword;

//super can be used to invoke parent class method
class Animal1 {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog1 extends Animal1 {
	void eat() {
		System.out.println("Dog is eating");
	}

	void bark() {
		System.out.println("Dog is barking");
	}

	void work() {
		bark();
		eat();
		super.eat();
	}
}

public class Student2 {
	public static void main(String[] args) {
		Dog1 d = new Dog1();
		d.work();
	}

}
