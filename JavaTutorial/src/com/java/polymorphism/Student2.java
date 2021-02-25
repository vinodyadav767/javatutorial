package com.java.polymorphism;

//Java Runtime Polymorphism Example: Bank

class Bank {
	double getInterestRate() {
		return 0;
	}
}

class SBI extends Bank {
	double getInterestRate() {
		return 8.0;
	}
}

class ICICI extends Bank {
	double getInterestRate() {
		return 7.5;
	}
}

class Axis extends Bank {
	double getInterestRate() {
		return 7.25;
	}
}

public class Student2 {
	public static void main(String[] args) {
		Bank b;
		b = new SBI();
		System.out.println(b.getInterestRate());
		b = new ICICI();
		System.out.println(b.getInterestRate());
		b = new Axis();
		System.out.println(b.getInterestRate());
	}
}
