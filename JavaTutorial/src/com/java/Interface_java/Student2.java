package com.java.Interface_java;

//An example of  Shape
interface Shape {
	void draw();
}

class Rectangle implements Shape {
	public void draw() {
		System.out.println("Drawing Rectangle");
	}
}

class Circle implements Shape {
	public void draw() {
		System.out.println("Drawing Circle");
	}
}

class Triangle implements Shape {
	public void draw() {
		System.out.println("Drawing Triangle");
	}
}

public class Student2 {
	public static void main(String[] args) {
		Shape rec, cir, tri;
		rec = new Rectangle();
		rec.draw();
		cir = new Circle();
		cir.draw();
		tri = new Triangle();
		tri.draw();
	}
}
