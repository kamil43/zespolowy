package com.zespolowy.spring.service;

import java.util.List;

import com.zespolowy.spring.model.Users_Role;

public interface Users_RoleService {
	
	public void addUsers_Role(Users_Role u);
	public void updateUsers_Role(Users_Role u);
	public List<Users_Role> listUsers_Role();
	public Users_Role getUsers_RoleById(int id);
	public void removeUsers_Role(int id);
}
