package com.java.HashSet;

import java.util.HashSet;
import java.util.Iterator;

//Real Example
class Book
	{
		int id;
		String name, publisher,writter;
		int quantity;
		Book(int id, String name, String publisher, String writter, int quantity)
		{
			this.id=id;
			this.name=name;
			this.publisher=publisher;
			this.writter=writter;
			this.quantity=quantity;
		}
	}
public class Student2 {
public static void main(String[] args) {
	HashSet<Book> hs=new HashSet<Book>();
	Book b1=new Book(101, "C Language", "Praksh", "S.K Yadav", 100);
	Book b2=new Book(102, "Java", "Praksh", "P.K Yadav", 150);
	Book b3=new Book(101, "C# .Net", "Praksh", "D.K Yadav", 50);
	Book b4=new Book(102, "Python", "Praksh", "N.P Yadav", 60);
	hs.add(b1);
	hs.add(b2);
	hs.add(b3);
	hs.add(b4);
	for(Book item: hs)
		System.out.println(item.id+" "+item.name+" "+item.publisher+" "+item.writter+" "+item.quantity);
	
}
}
