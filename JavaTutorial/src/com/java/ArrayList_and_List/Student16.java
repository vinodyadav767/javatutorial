package com.java.ArrayList_and_List;

import java.util.ArrayList;
import java.util.Iterator;

//Java ArrayList example of retainAll() method
public class Student16 {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();
	al.add("Vinod");
	al.add("Sohan");
	al.add("Satish");
	al.add("Saloni");
	al.add("Shreya");
	System.out.println("initial List: "+al);
	ArrayList<String> al1=new ArrayList<String>();
	al1.add("Avinash");
	al1.add("Addi");
	al1.add("Anand");
	al.retainAll(al1);
	System.out.println(al);
	Iterator itr=al.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	
}
}
