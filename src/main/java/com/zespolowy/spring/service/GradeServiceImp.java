package com.zespolowy.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zespolowy.spring.dao.GradeDao;
import com.zespolowy.spring.model.Grade;

@Service
public class GradeServiceImp implements GradeService{
	
	private GradeDao gradeDao;

	public void setGradeDao(GradeDao gradeDao) {
		this.gradeDao = gradeDao;
	}

	@Override
	@Transactional
	public void addGrade(Grade u) {
		this.gradeDao.addGrade(u);
	}

	@Override
	@Transactional
	public void updateGrade(Grade u) {
		this.gradeDao.updateGrade(u);
	}

	@Override
	@Transactional
	public List<Grade> listGrade() {
		return this.gradeDao.listGrade();
	}

	@Override
	@Transactional
	public Grade getGradeById(int id) {
		return this.gradeDao.getGradeById(id);
	}

	@Override
	@Transactional
	public void removeGrade(int id) {
		this.gradeDao.removeGrade(id);	
	}
}
