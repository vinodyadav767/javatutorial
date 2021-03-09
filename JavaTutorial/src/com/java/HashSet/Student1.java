package com.java.HashSet;

import java.util.HashSet;
import java.util.Iterator;

//Java HashSet Example
public class Student1 {
public static void main(String[] args) {
	HashSet<String> hs=new HashSet<String>();
	hs.add("A");
	hs.add("B");
	hs.add("C");
	hs.add("G");
	hs.add("D");
	hs.add("E");
	System.out.println(hs);
	if(hs.add("F"))
		System.out.println("F is Added succesfully");
	else
		System.out.println("F is already exist");
	if(hs.add("C"))
		System.out.println("C added succesfully");
	else
		System.out.println("C is alredy there can't add same value");
	System.out.println("Final HashSet: "+hs);
	Iterator<String> itr=hs.iterator();
	System.out.print("HashSet using Iterator: ");
	while(itr.hasNext())
		System.out.print(itr.next()+" ");
	System.out.println();
	System.out.println();
	
	//Java HashSet example to remove elements
	HashSet<String> hs1=new HashSet<String>();
	hs1.add("Vinod");
	hs1.add("Sohan");
	hs1.add("Satish");
	hs1.add("Saloni");
	hs1.add("Shreya");
	hs1.add("Avinash");
	hs1.add("Addi");
	hs1.add("Anand");
	System.out.println("HS before remove anything: "+hs1);
	hs1.remove("Saloni");
	System.out.println("HS after removing Saloni: "+hs1);
	HashSet<String> hs2=new HashSet<String>();
	hs2.add("Ansh");
	hs2.add("Shaumya");
	System.out.println("HS First before adding HS Second: "+hs1);
	hs1.addAll(hs2);
	System.out.println("HS First after adding HS Second: "+hs1);
	System.out.println();
	System.out.println("HS before removing Vinod: "+hs1);
	hs1.removeIf(a->a.contains("Vinod"));
	System.out.println("HS after adding Vionod: "+hs1);
	System.out.println();
	
	System.out.println("All Elements of HS First before removing all Elements of HS Second"+hs1);
	HashSet<String> hs3=new HashSet<String>();
	hs3.add("Shreya");
	hs3.add("Shaumya");
	hs3.add("Sohan");
	hs3.add("Anand");
	hs1.removeAll(hs3);
	System.out.println("All Elements of HS First after removing all Elements of HS Second"+hs1);
	System.out.println("HS Second: "+hs3);
	System.out.println("HS before clear: "+hs1);
	hs1.clear();
	System.out.println("HS after clear: "+hs1);
}
}
