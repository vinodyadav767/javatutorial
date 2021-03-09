package com.java.queue;

import java.util.PriorityQueue;
import java.util.Queue;

//Java PriorityQueue Example: Book

class Book implements Comparable<Book> {
	int id;
	String name, publisher;
	int qty;

	Book(int id, String name, String publisher, int qty) {
		this.id = id;
		this.name = name;
		this.publisher = publisher;
		this.qty = qty;
	}

	public int compareTo(Book b) {
		if (id > b.id) {
			return 1;
		} else if (id < b.id) {
			return -1;
		} else {
			return 0;
		}
	}
}

public class Student2 {
	public static void main(String[] args) {
		Queue<Book> q = new PriorityQueue<Book>();
		Book b1 = new Book(101, "C Language", "Praksh", 100);
		Book b2 = new Book(102, "Java", "Praksh", 150);
		q.add(b1);
		q.add(b2);
		for (Book item : q) {
			System.out.println(item.id + " " + item.name + " " + item.publisher + " " + item.qty);
		}
	}
}