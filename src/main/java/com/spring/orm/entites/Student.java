package com.spring.orm.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="student_details")
public class Student {

	@Id
	@Column(name= "student_id")
	private int studentID;
	@Column(name= "student_name")
	private String studentName;
	@Column(name= "student_city")
	private String studnetCity;
	
	public Student(int studentID, String studentName, String studnetCity) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studnetCity = studnetCity;
	}
	
	public Student() {
		super();
	}
	
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudnetCity() {
		return studnetCity;
	}
	public void setStudnetCity(String studnetCity) {
		this.studnetCity = studnetCity;
	}
	
}
