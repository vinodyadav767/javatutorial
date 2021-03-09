package com.java.AraryListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;


//It is used to insert the specified element at the specified position in a list.
public class Student1 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Vinod");
		al.add("Sohan");
		al.add("Satish");
		System.out.print("List of elements before adding: ");
		System.out.println(al);
		;
		al.add(0, "Saloni");
		System.out.print("List of elements after adding at spesific postion: ");
		System.out.print(al);
		System.out.println();
		System.out.println();

		al.add(2, "Shreya");
		System.out.print("List of elements after adding one more item:");
		System.out.println(al);
		System.out.println();
		System.out.print("list of elements with for loop: ");
		for (String s : al)
			System.out.print(s + " ");
		System.out.println();
		System.out.println();
		System.out.print("List elements with foreach loop: ");
		al.forEach(a -> {
			System.out.print(a + " ");
		});
		System.out.println();
		System.out.println();
		System.out.print("Results by while Loop: ");
		Iterator itr = al.iterator();
		while (itr.hasNext())
			System.out.print(itr.next() + " ");
		System.out.println();
		System.out.println();
		
		ArrayList<String>al1=new ArrayList<String>();
		al1.add("Avinash");
		al1.add("Addi");
		al1.add("Anand");
		System.out.print("List of elements before adding into anothe List: ");
		System.out.println(al1);
		System.out.print("List after adding into al: ");
		al.addAll(al1);
		System.out.print(al);
		System.out.println();
		System.out.print("After adding at spesific position: ");
		al.addAll(1, al1);
		System.out.print(al);
		
		System.out.println();
		System.out.println();
		System.out.println(al.get(1)+" "+al.get(0));
		System.out.println();
		
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al2.add(1);
		al2.add(2);
		al2.add(3);
		al2.add(4);
		al2.add(5);
		System.out.print("List of elements before capacity: ");
		System.out.print(al2);
		System.out.println();
		al2.ensureCapacity(5000);
		al2.add(6);
		al2.add(7);
		al2.add(4);
		System.out.print("List of elements after capacity 5000: ");
		System.out.print(al2);
		System.out.println();
		System.out.println();
		
		int a=al2.lastIndexOf(4);
		System.out.println("Last Index of 4 is: "+a);
		
		System.out.println();
		System.out.println();
		
		System.out.print("Before clear methods, Is the List empty: ");
		System.out.println(al2.isEmpty());
		al2.clear();
		System.out.println();
		System.out.print("After clear method,  Is the List empty: ");
		System.out.println(al2.isEmpty());
		
		ArrayList<Integer> al3=new ArrayList<Integer>();
		al3.add(10);
		al3.add(20);
		al3.add(30);
		al3.add(40);
		al3.add(50);
		System.out.print("List before Object array: ");
		System.out.print(al3);
		System.out.println();
		Object[] obj=al3.toArray();
		System.out.print("List after object array: ");
		for(Object i: obj)
			System.out.print(i+" ");
		System.out.println();
		System.out.println();
		
		System.out.print("List of Elements: "+al3);
		System.out.println();
		System.out.println();
		Object[] obj1=al3.toArray();
		System.out.println("List of arrays: "+ Arrays.toString(obj1));
		System.out.println();
		
		ArrayList<String> al4=new ArrayList<String>();
		al4.add("A");
		al4.add("B");
		al4.add("C");
		al4.add("D");
		al4.add("E");
		al4.add("F");
		System.out.print("List of elements before clone: "+al4);
		System.out.println();
		ArrayList<String> al5=new ArrayList<String>();
		al5=(ArrayList<String>) al4.clone();
		System.out.println("List of elements after clone: "+al5);
		System.out.println();
		
		ArrayList<Integer> al6=new ArrayList<Integer>();
		al6.add(10);
		al6.add(20);
		al6.add(30);
		al6.add(40);
		al6.add(50);
		al6.add(60);
		if(al6.contains(30))
		{
			System.out.println("30 is Available: ");
		}
		else
		{
			System.out.println("There is no 30: ");
		}
		ArrayList<Integer> al7=new ArrayList<Integer>();
		al7.add(30);
		al7.add(40);
		al7.add(50);
		if(al6.containsAll(al7))
		{
			System.out.println("List al7 is Available in al6");
		}
		else
		{
			System.out.println("List al7 is not available in al6");
		}
		System.out.println();
		
		ArrayList<Integer> al8=new ArrayList<Integer>();
		al8.add(1);
		al8.add(2);
		al8.add(3);
		al8.add(4);
		al8.add(5);
		int pos=al8.indexOf(4);
		System.out.println("index of 4 is: "+pos);
		System.out.println();
		
		ArrayList<String> al9=new ArrayList<String>();
		al9.add("A");
		al9.add("B");
		al9.add("C");
		al9.add("D");
		al9.add("E");
		al9.add("F");
		al9.add("G");
		System.out.println("List of elements before remove D: "+al9);
		al9.remove("D");
		System.out.println("List of elements after remove D: "+al9);
		System.out.println();
		
		ArrayList<Integer> al10=new ArrayList<Integer>();
		al10.add(1);
		al10.add(2);
		al10.add(3);
		al10.add(4);
		al10.add(5);
		System.out.println("List of elements beofre remove: "+al10);
		int re=2;
		al10.remove(re);
		System.out.println("List of elements beofre remove: "+al10);
		System.out.println();
		
		ArrayList<Integer> al11=new ArrayList<Integer>();
		al11.add(10);
		al11.add(20);
		al11.add(30);
		al11.add(40);
		al11.add(50);
		al11.add(60);
		al11.add(70);
		al11.add(80);
		al11.add(90);
		al11.add(100);
		System.out.println("List first before removing from second list: "+al11);
		ArrayList<Integer> al12=new ArrayList<Integer>();
		al12.add(20);
		al12.add(40);
		al12.add(70);
		al12.add(90);
		System.out.println("Second List before removing in first list: "+al12);
		al11.removeAll(al12);
		System.out.println("First List after removing from second list: "+al11);
		System.out.println("Second List after removing in  first list: "+al12);
		System.out.println();
		
		ArrayList<Integer> al13=new ArrayList<Integer>();
		al13.add(10);
		al13.add(20);
		al13.add(30);
		al13.add(40);
		al13.add(50);
		al13.add(60);
		al13.add(70);
		al13.add(80);
		al13.add(90);
		al13.add(100);
		System.out.println("List of elements before removeIf: "+al13);
		al13.removeIf(aif->aif%3==0);
		System.out.println("List of elements after removeIf: "+al13);
		System.out.println();
		
		ArrayList<Integer> al14=new ArrayList<Integer>();
		al14.add(1);
		al14.add(2);
		al14.add(3);
		al14.add(4);
		al14.add(5);
		al14.add(6);
		al14.add(7);
		al14.add(8);
		al14.add(9);
		al14.add(10);
		ArrayList<Integer> al15=new ArrayList<Integer>();
		al15.add(2);
		al15.add(3);
		al15.add(5);
		al15.add(6);
		System.out.println("First List Before retainAll:"+al14);
		System.out.println("Second List Before retainAll:"+al15);
		al14.retainAll(al15);
		System.out.println("First List Before retainAll:"+al14);
		System.out.println("Second List Before retainAll:"+al15);
		System.out.println();
		
		ArrayList<Integer> al16=new ArrayList<Integer>();
		al16.add(10);
		al16.add(20);
		al16.add(30);
		al16.add(40);
		al16.add(50);
		al16.add(60);
		al16.add(70);
		al16.add(80);
		al16.add(90);
		al16.add(100);
		System.out.println("List of elements before set: "+al16);
		int aa=al16.set(5, 110);
		int bb=al16.set(7, 120);
		System.out.println("List of elements after set: "+al16);
		System.out.println("The numbers replaced: "+aa+" "+bb );
		System.out.println();
		
		ArrayList<String> al17=new ArrayList<String>();
		al17.add("A");
		al17.add("B");
		al17.add("C");
		al17.add("D");
		al17.add("E");
		al17.add("F");
		System.out.println("List before spliter: "+al17);
		Spliterator<String>sptr=al17.spliterator();
		System.out.print("list after spliter: ");
		sptr.forEachRemaining(p->
		{
			System.out.print(p+" ");
		}
				);
		ArrayList<Integer> al18=new ArrayList<Integer>();
		al18.add(1);
		al18.add(2);
		al18.add(3);
		al18.add(4);
		al18.add(5);
		List<Integer> subList=al18.subList(1, 4);
		System.out.println("Elements of sublist: "+subList);
		System.out.println();
		
		ArrayList<Integer> al19=new ArrayList<Integer>();
		al19.add(1);
		al19.add(2);
		al19.add(3);
		al19.add(4);
		al19.add(5);
		al19.add(6);
		System.out.print("list with size: "+al19.size()+":  ");
		for(int i=0;i<al19.size();i++)
			System.out.print(al19.get(i)+" ");
	}
}
