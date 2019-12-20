package com.zespolowy.spring.service;

import java.util.List;

import com.zespolowy.spring.model.Grade;

public interface GradeService {
	
	public void addGrade(Grade u);
	public void updateGrade(Grade u);
	public List<Grade> listGrade();
	public Grade getGradeById(int id);
	public void removeGrade(int id);
}
