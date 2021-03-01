package com.java.accessmodifier;

//Role of Private Constructor
class S2
	{
		private S2()
		{
			System.out.println("Constructor is created");
		}
		private void run()
		{
			System.out.println("private method running");
		}
		public static void main(String[] args) {
			S2 s1=new S2();
			s1.run();
		}
	}
public class Student2 {
public static void main(String[] args) {
	// S2 s1=new S2(); compile time error	
}
}
