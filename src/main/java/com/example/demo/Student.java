package com.example.demo;

public class Student {
	
	private int rollNo;
	private String name, surname;
	
	
	
	public Student(int rollNo, String name, String surname) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.surname = surname;
	}



	public int getRollNo() {
		return rollNo;
	}



	public String getName() {
		return name;
	}



	public String getSurname() {
		return surname;
	}



	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", surname=" + surname + "]";
	}
	
	

}
