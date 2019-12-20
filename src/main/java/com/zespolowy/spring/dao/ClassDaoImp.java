package com.zespolowy.spring.dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zespolowy.spring.model.Class;

@Repository
public class ClassDaoImp implements ClassDao {
	
	private static final Logger logger = LoggerFactory.getLogger(ClassDaoImp.class);
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	@Override
	public void addClass(Class u) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(u);
		logger.info("class added ");
	}

	@Override
	public void updateClass(Class u) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(u);
		logger.info("class updated");
		
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Class> listClass() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Class> classList = session.createQuery("from Class").list();
		for(Class u : classList) {
			logger.info("class list : " + u.getLecture());
		}
		return classList;
	}

	@Override
	public Class getClassById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Class u = (Class) session.load(Class.class, new Integer(id));
		logger.info("class added " + u.getLecture());
		return u;
	}

	@Override
	public void removeClass(int it) {
		Session session = this.sessionFactory.getCurrentSession();
		Class u = (Class) session.load(Class.class, new Integer(it));
		if(null != u)
			session.delete(u);
		logger.info("classs deleted " + u .getLecture());
	}

}
