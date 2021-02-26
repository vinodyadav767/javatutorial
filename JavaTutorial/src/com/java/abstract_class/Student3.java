package com.java.abstract_class;

//Another example of Abstract class in java
abstract class Bank {
	abstract double getRateofInterest();
}

class SBI extends Bank {
	double getRateofInterest() {
		return 8.0;
	}
}

class ICICI extends Bank {
	double getRateofInterest() {
		return 7.5;
	}
}

class Axis extends Bank {
	double getRateofInterest() {
		return 7.0;
	}
}

public class Student3 {
	public static void main(String[] args) {
//		SBI sbi = new SBI();
//		System.out.println(sbi.getRateofInterest());
//		ICICI icici = new ICICI();
//		System.out.println(icici.getRateofInterest());
//		Axis axis = new Axis();
//		System.out.println(axis.getRateofInterest());
		Bank sbi,icici,axis;
		sbi=new SBI();
		System.out.println(sbi.getRateofInterest());
		icici=new ICICI();
		System.out.println(icici.getRateofInterest());
		axis=new Axis();
		System.out.println(axis.getRateofInterest());
	}

}
