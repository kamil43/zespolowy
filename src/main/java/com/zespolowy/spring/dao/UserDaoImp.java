package com.zespolowy.spring.dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zespolowy.spring.model.Users;

@Repository
public class UserDaoImp implements UserDao{
	
	private static final Logger logger = LoggerFactory.getLogger(UserDaoImp.class);
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	@Override
	public void addUser(Users u) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(u);
		logger.info("user added ");
	}

	
	@Override
	public void updateUser(Users u) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(u);
		logger.info("user updated");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Users> listUsers() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Users> usersList = session.createQuery("from Users").list();
		for(Users u : usersList) {
			logger.info("users list : " +u.getName());
		}
		return usersList;
	}

	@Override
	public Users getUserById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Users u = (Users) session.load(Users.class, new Integer(id));
		logger.info("user loaded " +u.getName());
		return u;
	}

	@Override
	public void removePerson(int it) {
		Session session = this.sessionFactory.getCurrentSession();
		Users u = (Users) session.load(Users.class, new Integer(it));
		if(null != u)
			session.delete(u);
		logger.info("user deleted " + u.getName());
	}
	

	

}
