package com.java.finalkeyword;

//Can we initialize blank final variable?
class S5 {
	final int speedLimit;

	S5() {
		speedLimit = 100;
		System.out.println(speedLimit);
	}
}

public class Student5 {
	public static void main(String[] args) {
		// Student5 s1=new Student5();
		S5 s = new S5();
	}
}
