package com.zespolowy.spring.service;
import java.util.List;

import com.zespolowy.spring.model.Users;

public interface UserService {

	public void addUser(Users u);
	public void updateUser(Users u);
	public List<Users> listUsers();
	public Users getUserById(int id);
	public void removeUser(int id);

	
	

}
