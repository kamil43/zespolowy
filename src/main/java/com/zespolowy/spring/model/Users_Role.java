package com.zespolowy.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="USERS_ROLE")

public class Users_Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_role;
	
	@Column(name = "id_user")
	private int id_user;
	
	@Column(name = "role")
	private int role;
	
	public void setId(int id) {
		this.id_role = id;
	}
	
	public int getId() {
		return id_role;
	}
	
	public void setUser(int user) {
		this.id_user = user;
	}
	
	public int getUser() {
		return id_user;
	}
	
	public void setRole(int role) {
		this.role = role;
	}
	
	public int getRole() {
		return role;
	}

}
