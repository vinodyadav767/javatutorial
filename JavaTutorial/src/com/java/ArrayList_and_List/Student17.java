package com.java.ArrayList_and_List;

import java.util.ArrayList;

//Java ArrayList example of isEmpty() method
public class Student17 {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();
	System.out.println("Is ArrayList Empty: "+al.isEmpty());
	al.add("Vinod");
	al.add("Sohan");
	al.add("Satish");
	System.out.println("after insertion into ArrayList");
	System.out.println("Is ArrayList Empty: "+al.isEmpty());
}
}
