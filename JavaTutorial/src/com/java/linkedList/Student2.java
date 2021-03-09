package com.java.linkedList;

import java.util.LinkedList;

//Java LinkedList example to add elements
public class Student2 {
public static void main(String[] args) {
	LinkedList<String>ll=new LinkedList<String>();
	ll.add("Vinod");
	ll.add("Sohan");
	ll.add("Satish");
	System.out.println("List before adding at spesific position: "+ll);
	  //Adding an element at the specific position 
	ll.add(2, "Saloni");
	System.out.println("List after adding at spesific position: "+ll);
	System.out.println();
	
	LinkedList<String>ll1=new LinkedList<String>();
	ll1.add("Avinash");
	ll1.add("Addi");
	ll1.add("Anand");
	 //Adding second list elements to the first list
	System.out.println("First List before adding Second List: "+ll);
	ll.addAll(ll1);
	System.out.println("First List after adding Second List: "+ll);
	System.out.println();
	
	LinkedList<String>ll2=new LinkedList<String>();
	ll2.add("Ansh");
	ll2.add("Shaumya");
	//Adding second list elements to the first list at specific position
	System.out.println("First List before adding Second List: "+ll);
	ll.addAll(2, ll2);
	System.out.println("First List after adding Second List at spesific position: "+ll);
	System.out.println();
	
	//Adding an element at the first position
	System.out.println("List beofre adding element at first postion: "+ll);
	ll.addFirst("Shreya");
	System.out.println("List after adding an element at first postion: "+ll);
	System.out.println();
	
	 //Adding an element at the last position  
	System.out.println("List beofre adding element at last postion: "+ll);
	ll.addLast("Babby");
	System.out.println("List after adding element at last postion: "+ll);
	}
}
