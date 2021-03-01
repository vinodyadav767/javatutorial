package com.java.ArrayList_and_List;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

//Java ArrayList Serialization and Deserialization Example
public class Student13 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Vinod");
		al.add("Sohan");
		al.add("Satish");
		al.add("Saloni");
		al.add("Shreya");
		try {
			// Serialization
			FileOutputStream fos = new FileOutputStream("file");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(al);
			fos.close();
			oos.close();
			//// Deserialization
			FileInputStream fis = new FileInputStream("file");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList list = (ArrayList) ois.readObject();
			System.out.println(list);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
