package com.java.Interface_java;

//An example for Bank
interface Bank {
	double getRateofInterest();
}

class SBI implements Bank {
	public double getRateofInterest() {
		return 8.25;
	}
}

class ICICI implements Bank {
	public double getRateofInterest() {
		return 7.75;
	}

}

class Axis implements Bank {
	public double getRateofInterest() {
		return 7.50;
	}
}

public class Student3 {
	public static void main(String[] args) {
		Bank sbi, icici, axis;
		sbi = new SBI();
		System.out.println(sbi.getRateofInterest());
		icici = new ICICI();
		System.out.println(icici.getRateofInterest());
		axis = new Axis();
		System.out.println(axis.getRateofInterest());
	}

}
