package com.java.overriding;

class Bank {
	int getInterest() {
		return 0;
	}
}

class SBI extends Bank {
	int getInterest() {
		return 8;
	}
}

class ICICI extends Bank {
	int getInterest() {
		return 7;
	}
}

class Axis extends Bank {
	int getInterest() {
		return 6;
	}
}

public class Student2 {
	public static void main(String[] args) {
		SBI sbi = new SBI();
		System.out.println("SBI Rate of Interest: " + sbi.getInterest());
		ICICI icici = new ICICI();
		System.out.println("ICICI Rate Interest: " + icici.getInterest());
		Axis axis = new Axis();
		System.out.println("Axis Rate of Interest: " + axis.getInterest());
	}
}
