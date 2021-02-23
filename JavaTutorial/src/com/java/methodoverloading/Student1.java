package com.java.methodoverloading;

//Method Overloading: changing no. of arguments
class S1 {
	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}
}

public class Student1 {
	public static void main(String[] args) {
		System.out.println(S1.add(10, 20));
		System.out.println(S1.add(10, 20, 30));
	}
}
