package com.zespolowy.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="CLASS")

public class Class {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_class;
	
	@Column(name = "id_lecture")
	private int id_lecture;
	
	@Column(name = "date")
	private String date;
	
	public void setId(int id) {
		this.id_class = id;
	}
	
	public int getId() {
		return id_class;
	}
	
	public void setLecture(int lecture) {
		this.id_lecture = lecture;
	}
	
	public int getLecture() {
		return id_lecture;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getDate() {
		return date;
	}
	


}
