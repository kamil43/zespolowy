package com.zespolowy.spring.dao;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zespolowy.spring.model.Presence;


@Repository
public class PresenceDaoImp implements PresenceDao{

	private static final Logger logger = LoggerFactory.getLogger(PresenceDaoImp.class);
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	@Override
	public void addPresence(Presence u) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(u);
		logger.info("Presence added ");
	}

	
	@Override
	public void updatePresence(Presence u) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(u);
		logger.info("Presence updated");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Presence> listPresence() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Presence> PresenceList = session.createQuery("from Presence").list();
		for(Presence u : PresenceList) {
			logger.info("Presence list : " +u.getUser());
		}
		return PresenceList;
	}

	@Override
	public Presence getPresenceById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Presence u = (Presence) session.load(Presence.class, new Integer(id));
		logger.info("user loaded " +u.getUser());
		return u;
	}

	@Override
	public void removePresence(int it) {
		Session session = this.sessionFactory.getCurrentSession();
		Presence u = (Presence) session.load(Presence.class, new Integer(it));
		if(null != u)
			session.delete(u);
		logger.info("user deleted " + u.getUser());
	}
}
