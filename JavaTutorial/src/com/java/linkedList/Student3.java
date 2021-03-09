package com.java.linkedList;

import java.util.LinkedList;

//Java LinkedList example to remove elements
public class Student3 {
public static void main(String[] args) {
	LinkedList<String> ll=new LinkedList<String>();
	ll.add("Sohan");
	ll.add("Satish");
	ll.add("Vinod");
	ll.add("Saloni");
	ll.add("Shreya");
	ll.add("Avinash");
	ll.add("Addi");
	ll.add("Ananad");
	System.out.println("Initial list of Elements: "+ll);
	 //Removing specific element from LinkedList  
	ll.remove("Vinod");
	System.out.println("List of removinod vinod: "+ll);
	System.out.println();
	
	//Removing element on the basis of specific position  
	System.out.println("List before removinog at spesific position: "+ll);
	ll.remove(4);
	System.out.println("List after removing at spesific position: "+ll);
	System.out.println();
	
	LinkedList<String> ll1=new LinkedList<String>();
	ll1.add("Ansh");
	ll1.add("Shaumya");
	// Adding new LinkedList into first linkedList
	System.out.println("First LinkedList before addind new LL: "+ll);
	ll.addAll(ll1);
	System.out.println("First LL after adding new LL: "+ll);
	System.out.println();
	
	//Removing first LL from second LL
	System.out.println("First LL:"+ll);
	ll.removeAll(ll1);
	System.out.println("First Ll after removing second LL: "+ll);
	System.out.println();
	
	//Removing first element from the LinkedList
	System.out.println("LL before removing first element: "+ll);
	ll.removeFirst();
	System.out.println("LL after removing first element: "+ll);
	System.out.println();
	
	//Removing last element from the LL
	System.out.println("LL before removing last element: "+ll);
	ll.removeLast();
	System.out.println("LL after removing last element: "+ll);
	System.out.println();
	
	ll.add("Saloni");
	ll.add("Satish");
	
	//removing first occurrence of element from the LL
	System.out.println("LL before removing first occurrence: "+ll);
	ll.removeFirstOccurrence("Satish");
	System.out.println("LL after removing F.O"+ll);
	System.out.println();
	
	//removing Last Occurrence of element from the LL
	System.out.println("LL before remove Last Occurence: "+ll);
	ll.removeLastOccurrence("Saloni");
	System.out.println("LL after remove L.O: "+ll);
	System.out.println();
	
	//Removing all the elements from LL
	System.out.println("LL before clear: "+ll);
	ll.clear();
	System.out.println("LL after clear: "+ll);
}
}
