package com.zespolowy.spring.dao;

import java.util.List;

import com.zespolowy.spring.model.Class;

public interface ClassDao {
	
	public void addClass(Class u);
	public void updateClass(Class u);
	public List<Class> listClass();
	public Class getClassById(int id);
	public void removeClass(int it);
	
}
