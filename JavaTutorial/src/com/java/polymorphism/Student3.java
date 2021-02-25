package com.java.polymorphism;

//Java Runtime Polymorphism Example: Shape
class Shape {
	void drow() {
		System.out.println("Drowing");
	}
}

class Rectangle extends Shape {
	void drow() {
		System.out.println("Rectangle drowing");
	}
}

class Circle extends Shape {
	void drow() {
		System.out.println("Square drowing");
	}
}

class Tringle extends Shape {
	void drow() {
		System.out.println("Tringle drowing");
	}
}

public class Student3 {
	public static void main(String[] args) {
		Shape s;
		s = new Rectangle();
		s.drow();
		s = new Circle();
		s.drow();
		s = new Tringle();
		s.drow();
	}
}
