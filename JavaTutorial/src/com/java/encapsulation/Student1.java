package com.java.encapsulation;

//Simple Example of Encapsulation in Java
class S1 {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class Student1 {
	public static void main(String[] args) {
		S1 s1 = new S1();
		s1.setName("Vinod Yadav");
		System.out.println(s1.getName());
	}
}
