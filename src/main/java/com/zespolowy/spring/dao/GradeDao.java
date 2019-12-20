package com.zespolowy.spring.dao;

import java.util.List;

import com.zespolowy.spring.model.Grade;

public interface GradeDao {

	public void addGrade(Grade u);
	public void updateGrade(Grade u);
	public List<Grade> listGrade();
	public Grade getGradeById(int id);
	public void removeGrade(int it);
}
