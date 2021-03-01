package com.java.ArrayList_and_List;

import java.util.ArrayList;
import java.util.Iterator;

//User-defined class objects in Java ArrayList
class S12
	{
		int Id;
		String name;
		int rollNo;
		String university;
		S12(int Id, String name, int rollNo, String university)
		{
			this.Id=Id;
			this.name=name;
			this.rollNo=rollNo;
			this.university=university;
		}
	}
public class Student12 {
public static void main(String[] args) {
	S12 s1=new S12(101, "Vinod Yadav", 101, "UTB");
	S12 s2=new S12(102, "Sohan Yadav", 102, "University of Miskolc");
	S12 s3=new S12(103, "Satish Yadav", 103, "IES");
	ArrayList<S12> list=new ArrayList<S12>();
	list.add(s1);
	list.add(s2);
	list.add(s3);
	Iterator itr=list.iterator();
	while(itr.hasNext())
	{
		S12 s12=(S12)itr.next();
		System.out.println(s12.Id+" "+s12.name+" "+s12.rollNo+" "+s12.university);
	}
	
	
}
}
