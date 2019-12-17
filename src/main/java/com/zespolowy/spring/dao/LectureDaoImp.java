package com.zespolowy.spring.dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zespolowy.spring.model.Lecture;

@Repository
public class LectureDaoImp implements LectureDao{

	private static final Logger logger = LoggerFactory.getLogger(LectureDaoImp.class);
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	@Override
	public void addLecture(Lecture l) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(l);
		logger.info("lecture added");
	}

	@Override
	public void updateLecture(Lecture l) {
		Session session = this.sessionFactory.getCurrentSession();
		session.saveOrUpdate(l);
		logger.info("lecture updated");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Lecture> listLectures() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Lecture> lecturesList = session.createQuery("from Lecture").list();
		for (Lecture l : lecturesList) {
			logger.info("lectures list : " + l.getSubject());
		}
		return lecturesList;
	}

	@Override
	public Lecture getLectureById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Lecture l = (Lecture) session.load(Lecture.class, new Integer(id));
		logger.info("lecture loaded " +l.getSubject());
		return l;
	}

	@Override
	public void removeLecture(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Lecture l = (Lecture) session.load(Lecture.class, new Integer(id));
		if(null != l)
			session.delete(l);
		logger.info("lecture deleted " + l.getSubject());
	}

}
