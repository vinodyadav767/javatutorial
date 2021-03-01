package com.java.encapsulation;

//Read-Only class
public class Student2 {
private String name="Vinod Yadav";
public String getName() {
	return name;
}

public static void main(String[] args) {
	Student2 s2=new Student2();
	// s2.setName("Yadav Vinod"); C.T error
	System.out.println(s2.getName());
}

}
