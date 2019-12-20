package com.zespolowy.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.zespolowy.spring.model.Students_Class;

@Repository
public class Students_ClassDaoImp implements Students_ClassDao{

	private static final Logger logger = LoggerFactory.getLogger(Students_ClassDaoImp.class);
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	@Override
	public void addStudents_Class(Students_Class u) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(u);
		logger.info("Students_Class added ");
	}

	
	@Override
	public void updateStudents_Class(Students_Class u) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(u);
		logger.info("Students_Class updated");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Students_Class> listStudents_Class() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Students_Class> Students_ClassList = session.createQuery("from Students_Class").list();
		for(Students_Class u : Students_ClassList) {
			logger.info("Students_Class list : " +u.getStudent());
		}
		return Students_ClassList;
	}

	@Override
	public Students_Class getStudents_ClassById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Students_Class u = (Students_Class) session.load(Students_Class.class, new Integer(id));
		logger.info("Students_Class loaded " + u.getStudent());
		return u;
	}

	@Override
	public void removeStudents_Class(int it) {
		Session session = this.sessionFactory.getCurrentSession();
		Students_Class u = (Students_Class) session.load(Students_Class.class, new Integer(it));
		if(null != u)
			session.delete(u);
		logger.info("Students_Class deleted " + u.getStudent());
	}
}
