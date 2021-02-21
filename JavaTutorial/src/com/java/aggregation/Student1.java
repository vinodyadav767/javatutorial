package com.java.aggregation;

class Address {
	String city;
	String state;
	String country;

	Address(String city, String state, String country) {
		this.city = city;
		this.state = state;
		this.country = country;
	}
}

public class Student1 {
	int id;
	String name;
	Address address;

	Student1(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void printData() {
		System.out.println(id + " " + name);
		System.out.println(address.city + " " + address.state + " " + address.country);
	}

	public static void main(String[] args) {
		Address adress1 = new Address("Meerut", "U.P", "india");
		Address address2 = new Address("Zlin", "Zlin", "Czech");
		Student1 s1 = new Student1(101, "Vinod", adress1);
		Student1 s2 = new Student1(102, "Yadav", address2);
		s1.printData();
		s2.printData();
	}

}
