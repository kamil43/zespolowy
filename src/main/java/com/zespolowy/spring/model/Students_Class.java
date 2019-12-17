package com.zespolowy.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="STUDENTS_CLASS")

public class Students_Class {
	
	@Column(name = "id_student")
	private int id_student;

	@Column(name = "id_class")
	private int id_class;
	
	public void setStudent(int student) {
		this.id_student = student;
	}
	
	public int getStudent() {
		return id_student;
	}
	
	public void setClass(int clas) {
		this.id_class = clas;
	}
	
	public int getClas() {
		return id_class;
	}
}
