package com.java.abstract_class;

//Understanding the real scenario of Abstract class
abstract class Shape {
	abstract void draw();
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("Drawing Rectangle");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("Dwaing Circle");
	}
}

class Triangle extends Shape {
	void draw() {
		System.out.println("Drawing Triangle");
	}
}

public class Student2 {
	public static void main(String[] args) {
//		Rectangle r = new Rectangle();
//		r.draw();
//		Circle c = new Circle();
//		c.draw();
//		Triangle t = new Triangle();
//		t.draw();
		Shape rec,cir,tri;
		rec=new Rectangle();
		rec.draw();
		cir=new Circle();
		cir.draw();
		tri=new Triangle();
		tri.draw();
	}
}
