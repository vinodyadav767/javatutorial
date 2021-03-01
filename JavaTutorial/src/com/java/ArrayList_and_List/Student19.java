package com.java.ArrayList_and_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Example for Students
class S19 {
	int id;
	String name, address, rollNo;
	double fee;

	public S19(int id, String name, String address, String rollNo, double fee) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.rollNo = rollNo;
		this.fee = fee;
	}
}

public class Student19 {
	public static void main(String[] args) {
		List<S19> list = new ArrayList<S19>();
		S19 s1 = new S19(101, "Vinod Yadav", "Zlin", "KRK783", 200000);
		S19 s2 = new S19(102, "Sohan Yadav", "Budapest", "YAF541", 300000);
		S19 s3 = new S19(103, "Satish Yadav", "Bhopal", "SAT788", 35000);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		for (S19 students : list)
			System.out.println(students.id + " " + students.name + " " + students.rollNo + " " + students.fee);
		System.out.println();
		list.forEach(a -> {
			System.out.println(a.id + " " + a.name + " " + a.rollNo + " " + a.fee);
		});

	}
}
