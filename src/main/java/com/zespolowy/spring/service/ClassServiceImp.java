package com.zespolowy.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zespolowy.spring.dao.ClassDao;
import com.zespolowy.spring.model.Class;

@Service
public class ClassServiceImp implements ClassService{
	private ClassDao classDao;

	public void setClassDao(ClassDao classDao) {
		this.classDao = classDao;
	}

	@Override
	@Transactional
	public void addClass(Class u) {
		this.classDao.addClass(u);
	}

	@Override
	@Transactional
	public void updateClass(Class u) {
		this.classDao.updateClass(u);
	}

	@Override
	@Transactional
	public List<Class> listClass() {
		return this.classDao.listClass();
	}

	@Override
	@Transactional
	public Class getClassById(int id) {
		return this.classDao.getClassById(id);
	}

	@Override
	@Transactional
	public void removeClass(int id) {
		this.classDao.removeClass(id);	
	}
	
}
