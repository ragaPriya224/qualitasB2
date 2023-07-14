package com.qualitas.qualitasPractice.model;

public class Student {
	
	String studentId;
	String name;
	String major;
	
	public Student() {
		
	}
	
	public Student(String studentId, String name, String major) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.major = major;
	}
	
	//public getter and setter
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
}
