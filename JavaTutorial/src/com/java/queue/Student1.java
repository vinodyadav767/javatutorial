package com.java.queue;
import java.util.Iterator;
import java.util.PriorityQueue;

//All methods of queue
public class Student1 {
public static void main(String[] args) {
	PriorityQueue<String> pq=new PriorityQueue<String>();
	//boolean add(object)	It is used to insert the specified element into this queue and return true upon success.
	pq.add("A");
	pq.add("B");
	pq.add("C");
	pq.add("D");
	pq.add("E");
	System.out.println("Initial Queue: "+pq);
	System.out.println();
	
	//boolean offer(object)	It is used to insert the specified element into this queue.
	pq.offer("F");
	pq.offer("G");
	System.out.println("After adding two elements: "+pq);
	
	System.out.print("All the elements of Q: ");
	Iterator itr=pq.iterator();
	while(itr.hasNext())
		System.out.print(itr.next()+" ");
	System.out.println();
	System.out.println();
	
	//Object remove()	It is used to retrieves and removes the head of this queue.
	System.out.println("Q before remove: "+pq);
	pq.remove();
	System.out.println("Q after remove: "+pq);
	pq.remove("G");
	System.out.println("Q after remove G: "+pq);
	System.out.println();
	
	//Object poll()	It is used to retrieves and removes the head of this queue, or returns null if this queue is empty.
	System.out.println("Q before poll: "+pq);
	System.out.println("Q after poll: "+pq.poll()+" "+pq);
	
	//Object element()	It is used to retrieves, but does not remove, the head of this queue.
	System.out.println("First Element using element: "+pq.element());
	System.out.println();
	
	//Object peek()	It is used to retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
	System.out.println("First Element using element:"+pq.peek());
}
}
