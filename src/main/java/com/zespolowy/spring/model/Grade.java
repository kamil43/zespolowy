package com.zespolowy.spring.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="GRADE")

public class Grade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_grade;
	
	@Column(name = "grade")
	private int grade;
	
	@Column(name = "id_user")
	private int id_user;
	
	@Column(name = "id_lecture")
	private int id_lecture;
	
	@Column(name = "note")
	private String note;

	
	public void setId(int id) {
		this.id_grade = id;
	}
	
	public int getId() {
		return id_grade;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void setUser(int user) {
		this.id_user = user;
	}
	
	public int getUser() {
		return id_user;
	}
	
	public void setLecture(int lecture) {
		this.id_lecture = lecture;
	}
	
	public int getLecture() {
		return id_lecture;
	}
	
	public void setNote(String note) {
		this.note = note;
	}
	
	public String getNote() {
		return note;
	}
}
