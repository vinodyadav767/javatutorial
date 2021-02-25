package com.java.polymorphism;

//Java Runtime Polymorphism Example: Animal
class Animal
	{
		void eat()
		{
			System.out.println("Animals are eating");
		}
	}
class Dog extends Animal
	{
		void eat()
		{
			System.out.println("Dog is eating");
		}
	}
class Cat extends Animal
	{
		void eat()
		{
			System.out.println("Cat is eating");
		}
	}
class Lion extends Animal
	{
		void eat()
		{
			System.out.println("Lion is eating");
		}
	}
public class Student4 {
public static void main(String[] args) {
	Animal a;
	a=new Dog();
	a.eat();
	a=new Cat();
	a.eat();
	a=new Lion();
	a.eat();
	a=new Animal();
	a.eat();
}
}
