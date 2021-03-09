package com.java.ArrayList_and_List;

import java.util.ArrayList;
import java.util.Spliterator;

////void replaceAll(UnaryOperator<E> operator)	It is used to replace all the elements from the list with the specified element.

class S23
	{
		int id;
		String name;
		S23(int id, String name)
		{
			this.id=id;
			this.name=name;
		}
		void printData()
		{
			System.out.println(id+" "+name);
		}
	}
public class Student23 {
public static void main(String[] args) {
	ArrayList<S23> s23=new ArrayList<S23>();
	S23 s1=new S23(101, "Vinod");
	S23 s2=new S23(102,"Sohan");
	S23 s3=new S23(103, "Satish");
	s23.add(s1);
	s23.add(s2);
	s23.add(s3);
	Spliterator<S23> details=s23.spliterator();
	details.forEachRemaining(a->a.printData());
}

}
