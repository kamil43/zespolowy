package com.zespolowy.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.zespolowy.spring.model.Users_Role;

@Repository
public class Users_RoleDaoImp implements Users_RoleDao{
	
private static final Logger logger = LoggerFactory.getLogger(Users_RoleDaoImp.class);
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	@Override
	public void addUsers_Role(Users_Role u) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(u);
		logger.info("Users_Role added ");
	}

	
	@Override
	public void updateUsers_Role(Users_Role u) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(u);
		logger.info("Users_Role updated");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Users_Role> listUsers_Role() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Users_Role> Users_RoleList = session.createQuery("from Users_Role").list();
		for(Users_Role u : Users_RoleList) {
			logger.info("Users_Role list : " +u.getRole());
		}
		return Users_RoleList;
	}

	@Override
	public Users_Role getUsers_RoleById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Users_Role u = (Users_Role) session.load(Users_Role.class, new Integer(id));
		logger.info("user loaded " +u.getRole());
		return u;
	}

	@Override
	public void removeUsers_Role(int it) {
		Session session = this.sessionFactory.getCurrentSession();
		Users_Role u = (Users_Role) session.load(Users_Role.class, new Integer(it));
		if(null != u)
			session.delete(u);
		logger.info("user deleted " + u.getRole());
	}
	
}
