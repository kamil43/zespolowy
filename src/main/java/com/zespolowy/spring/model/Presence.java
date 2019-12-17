package com.zespolowy.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="PRESENCE")


public class Presence {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_presence;
	
	@Column(name = "id_user")
	private int id_user;
	
	@Column(name = "id_lecture")
	private int id_lecture;
	
	@Column(name = "id_class")
	private int id_class;
	
	public void setId(int id) {
		this.id_presence = id;
	}
	
	public int getId() {
		return id_presence;
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
	
	public void setClass(int clas) {
		this.id_class = clas;
	}
	
	public int getClas() {
		return id_class;
	}
}
