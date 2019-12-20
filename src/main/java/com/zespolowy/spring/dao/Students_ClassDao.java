package com.zespolowy.spring.dao;

import java.util.List;

import com.zespolowy.spring.model.Students_Class;

public interface Students_ClassDao {

	public void addStudents_Class(Students_Class u);
	public void updateStudents_Class(Students_Class u);
	public List<Students_Class> listStudents_Class();
	public Students_Class getStudents_ClassById(int id);
	public void removeStudents_Class(int it);
}
