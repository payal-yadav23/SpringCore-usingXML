package com.entities;

public class Student {

	private int stud_id;
	private String studName;
	private String city;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int stud_id, String studName, String city) {
		super();
		this.stud_id = stud_id;
		this.studName = studName;
		this.city = city;
	}

	public int getStud_id() {
		return stud_id;
	}

	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [stud_id=" + stud_id + ", studName=" + studName + ", city=" + city + "]";
	}

}
