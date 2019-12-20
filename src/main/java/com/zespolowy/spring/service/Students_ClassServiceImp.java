package com.zespolowy.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zespolowy.spring.dao.Students_ClassDao;
import com.zespolowy.spring.model.Students_Class;

@Service
public class Students_ClassServiceImp implements Students_ClassService{

	private Students_ClassDao students_ClassDao;

	public void setStudents_ClassDao(Students_ClassDao students_ClassDao) {
		this.students_ClassDao = students_ClassDao;
	}

	@Override
	@Transactional
	public void addStudents_Class(Students_Class u) {
		this.students_ClassDao.addStudents_Class(u);
	}

	@Override
	@Transactional
	public void updateStudents_Class(Students_Class u) {
		this.students_ClassDao.updateStudents_Class(u);
	}

	@Override
	@Transactional
	public List<Students_Class> listStudents_Class() {
		return this.students_ClassDao.listStudents_Class();
	}

	@Override
	@Transactional
	public Students_Class getStudents_ClassById(int id) {
		return this.students_ClassDao.getStudents_ClassById(id);
	}

	@Override
	@Transactional
	public void removeStudents_Class(int id) {
		this.students_ClassDao.removeStudents_Class(id);	
	}
}
