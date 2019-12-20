package com.zespolowy.spring.dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zespolowy.spring.model.Grade;


@Repository
public class GradeDaoImp implements GradeDao{

	private static final Logger logger = LoggerFactory.getLogger(GradeDaoImp.class);
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	
	@Override
	public void addGrade(Grade u) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(u);
		logger.info("grade added ");		
	}

	@Override
	public void updateGrade(Grade u) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(u);
		logger.info("grade updated");		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Grade> listGrade() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Grade> GradeList = session.createQuery("from Grade").list();
		for(Grade u : GradeList) {
			logger.info("Grade list : " +u.getGrade());
		}
		return GradeList;
	}

	@Override
	public Grade getGradeById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Grade u = (Grade) session.load(Grade.class, new Integer(id));
		logger.info("Grade loaded " +u.getGrade());
		return u;
	}

	@Override
	public void removeGrade(int it) {
		Session session = this.sessionFactory.getCurrentSession();
		Grade u = (Grade) session.load(Grade.class, new Integer(it));
		if(null != u)
			session.delete(u);
		logger.info("Grade deleted " + u.getGrade());
		
	}

}
