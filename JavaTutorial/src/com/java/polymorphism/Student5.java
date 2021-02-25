package com.java.polymorphism;

// Runtime polymorphism can't be achieved by data members.
class Bike {
	int bikeSpeed = 90;
}

class Passion extends Bike {
	int bikeSpeed = 120;
}

class Splender extends Bike {
	int bikeSpeed = 140;
}

public class Student5 {
	public static void main(String[] args) {
		Bike b;
		b = new Passion();
		System.out.println(b.bikeSpeed);
		b = new Splender();
		System.out.println(b.bikeSpeed);
		b = new Bike();
		System.out.println(b.bikeSpeed);
	}
}
