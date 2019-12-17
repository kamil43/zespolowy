package com.zespolowy.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zespolowy.spring.dao.UserDao;
import com.zespolowy.spring.model.Users;

@Service
public class UserServiceImpl implements UserService{
	
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	@Transactional
	public void addUser(Users u) {
		this.userDao.addUser(u);
	}

	@Override
	@Transactional
	public void updateUser(Users u) {
		this.userDao.updateUser(u);
	}

	@Override
	@Transactional
	public List<Users> listUsers() {
		return this.userDao.listUsers();
	}

	@Override
	@Transactional
	public Users getUserById(int id) {
		return this.userDao.getUserById(id);
	}

	@Override
	@Transactional
	public void removeUser(int id) {
		this.userDao.removePerson(id);	
	}
	
}
