package com.java.encapsulation;

class S4 {
	private int a = 100;
	private String tut = "encapsulation in java in hindi";

	public int getA() {
		return a;
	}

	public String getTut() {
		return tut;
	}
}

public class Student4 {
	public static void main(String[] args) {
		S4 s4 = new S4();
		System.out.println(s4.getA() + " " + s4.getTut());
	}

}
