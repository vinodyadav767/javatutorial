package com.java.methodoverloading;

//Can we overload java main() method?
public class Student4 {
public static void main(String[] args) {
	System.out.println("main with String[]");
}
public static void main(String args) {
	System.out.println("Main with Stgring args");
}
public static void main() {
	System.out.println("Main without args");
}
}
