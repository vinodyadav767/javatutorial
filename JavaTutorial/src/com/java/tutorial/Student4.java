package com.java.tutorial;

//We can also create multiple objects and store information in it through reference variable.
class S4 {
	int id;
	String name;
}

public class Student4 {
	public static void main(String[] args) {
		S4 s1 = new S4();
		s1.id = 101;
		s1.name = "Vinod";
		S4 s2 = new S4();
		s2.id = 102;
		s2.name = "Yadav";
		System.out.println(s1.id+ " "+s1.name);
		System.out.println(s2.id+" "+s2.name);
	}

}
