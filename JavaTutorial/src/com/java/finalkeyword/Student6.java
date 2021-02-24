package com.java.finalkeyword;

//Example of static blank final variable
public class Student6 {
	static final int speedLimit;
	static {speedLimit=100;}
	public static void main(String[] args) {
		System.out.println(speedLimit);
	}

}
