package com.java.abstract_class;

//Another real scenario of abstract class
interface I5
	{
		void a();
		void b();
		void c();
		void d();
	}
abstract class S5 implements I5
	{
		public void a()
		{
			System.out.println("I am a");
		}
	}
class S55 extends S5
	{
		public void b() 
		{
			System.out.println("I am b");
		}
		public void c()
		{
			System.out.println("i am c ");
		}
		public void d()
		{
			System.out.println("i am d");
		}
	}
public class Student5 {
	public static void main(String[] args) {
		S55 s1=new S55();
		s1.a();
		s1.b();
		s1.c();
		s1.d();
		System.out.println();
		S5 s2=new S55();
		s2.a();
		s2.b();
		s2.c();
		s2.d();
		System.out.println();
		I5 i1=new S55();
		i1.a();
		i1.b();
		i1.c();
		i1.d();
	
	}

}
