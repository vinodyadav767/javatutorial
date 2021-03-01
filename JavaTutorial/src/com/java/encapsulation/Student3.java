package com.java.encapsulation;

//Another Example of Encapsulation in Java
class S3 {
	private int Id;
	private String name, address;
	private double amt;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getAmt() {
		return amt;
	}

	public void setAmt(double amt) {
		this.amt = amt;
	}
}

public class Student3 {
	public static void main(String[] args) {
		S3 s3 = new S3();
		s3.setId(101);
		s3.setName("Vinod Yadav");
		s3.setAddress("Zlin");
		s3.setAmt(150000);
		System.out.println(s3.getId() + " " + s3.getName() + " " + s3.getAddress() + " " + s3.getAmt());
	}

}
