package com.zespolowy.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zespolowy.spring.dao.Users_RoleDao;
import com.zespolowy.spring.model.Users_Role;

@Service
public class Users_RoleServiceImp implements Users_RoleService{

	private Users_RoleDao users_RoleDao;

	public void setUsers_RoleDao(Users_RoleDao users_roleDao) {
		this.users_RoleDao = users_roleDao;
	}

	@Override
	@Transactional
	public void addUsers_Role(Users_Role u) {
		this.users_RoleDao.addUsers_Role(u);
	}

	@Override
	@Transactional
	public void updateUsers_Role(Users_Role u) {
		this.users_RoleDao.updateUsers_Role(u);
	}

	@Override
	@Transactional
	public List<Users_Role> listUsers_Role() {
		return this.users_RoleDao.listUsers_Role();
	}

	@Override
	@Transactional
	public Users_Role getUsers_RoleById(int id) {
		return this.users_RoleDao.getUsers_RoleById(id);
	}

	@Override
	@Transactional
	public void removeUsers_Role(int id) {
		this.users_RoleDao.removeUsers_Role(id);	
	}
}
