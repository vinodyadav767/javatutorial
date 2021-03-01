package com.java.ArrayList_and_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//Java ArrayList Example: Book
class Book
	{
		int id;
		String name,author,publisher;
		int quantity;
		public Book(int id, String name,String author, String publisher, int quantity)
		{
			this.id=id;
			this.name=name;
			this.author=author;
			this.publisher=publisher;
			this.quantity=quantity;
		}
	}
public class Student18 {
public static void main(String[] args) {
	 List<Book> list=new ArrayList<Book>();
	 Book b1=new Book(101, "Let's C", "B.K Yadav", "Praksh publication", 100);
	 Book b2=new Book(101, "Java", "D.K Yadav", "Praksh publication", 100);
	 Book b3=new Book(101, "Data Structure", "K.C Yadav", "Praksh publication", 100);
	 Book b4=new Book(101, "Math", "M.U Yadav", "Praksh publication", 100);
	 Book b5=new Book(101, "C#.Net", "D.U Yadav", "Praksh publication", 100);
	 list.add(b1);
	 list.add(b2);
	 list.add(b3);
	 list.add(b4);
	 list.add(b5);
	 Iterator itr=list.iterator();
	 for(Book b:list)
		 System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher);
}
}
