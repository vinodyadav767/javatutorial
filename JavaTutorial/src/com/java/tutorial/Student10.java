package com.java.tutorial;

//Real World Example: Account
class Account {
	int accountNo;
	String name;
	double accBalance;

	void insertAcc(int a, String n, double b) {
		accountNo = a;
		name = n;
		accBalance = b;
	}

	void deposit(double a) {
		System.out.println("Deposited Amount: " + a);
		accBalance = accBalance + a;
		System.out.println("Avail Balance: " + accBalance);
	}

	void withdraw(double a) {
		if(accBalance>=a)
		{
		System.out.println("Withdrawn Amount: " + a);
		accBalance = accBalance - a;
		System.out.println("Avail Balance: " + accBalance);
		}
		else
		{
			System.out.println("Insufficient Account Balance");
		}
	}

	void checkBalance() {
		System.out.println("Available Balance: " + accBalance);
	}
}

public class Student10 {
	public static void main(String[] args) {
		Account a1 = new Account();
		a1.accountNo = 1236547890;
		a1.name = "Vinod Yadav";
		a1.accBalance = 50000;
		a1.deposit(10000);
		System.out.println();
		a1.withdraw(15000);
		System.out.println();
		a1.checkBalance();
	}
}
