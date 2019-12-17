package com.zespolowy.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="LECTURE")

public class Lecture {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_lecture;

	@Column(name = "subject")
	private String subject;
	
	@Column(name = "note")
	private String note;
	
	public void setId(int id) {
		this.id_lecture = id;
	}
	
	public int getId() {
		return id_lecture;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setNote(String note) {
		this.note = note;
	}
	
	public String getNote() {
		return note;
	}
	
	
}
