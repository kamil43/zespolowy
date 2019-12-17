package com.zespolowy.spring.service;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zespolowy.spring.dao.LectureDao;
import com.zespolowy.spring.model.Lecture;

@Service
public class LectureServiceImpl implements LectureService {
	
	private LectureDao lectureDao;
	
	public void setLectureDao(LectureDao lectureDao) {
		this.lectureDao = lectureDao;
	}

	@Override
	@Transactional
	public void addLecture(Lecture l) {
		this.lectureDao.addLecture(l);
	}
	
	@Override
	@Transactional
	public void updateLecture(Lecture l) {
		this.lectureDao.updateLecture(l);
	}
	
	@Override
	@Transactional
	public List<Lecture> listLectures(){
		return this.lectureDao.listLectures();
	}
	
	@Override
	@Transactional
	public Lecture getLectureById(int id) {
		return this.lectureDao.getLectureById(id);
	}
	
	@Override
	@Transactional
	public void removeLecture(int id) {
		this.lectureDao.removeLecture(id);
	}
}
