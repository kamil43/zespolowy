package com.zespolowy.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zespolowy.spring.dao.PresenceDao;
import com.zespolowy.spring.model.Presence;

@Service
public class PresenceServiceImp implements PresenceService{
	
	private PresenceDao presenceDao;

	public void setPresenceDao(PresenceDao presenceDao) {
		this.presenceDao = presenceDao;
	}

	@Override
	@Transactional
	public void addPresence(Presence u) {
		this.presenceDao.addPresence(u);
	}

	@Override
	@Transactional
	public void updatePresence(Presence u) {
		this.presenceDao.updatePresence(u);
	}

	@Override
	@Transactional
	public List<Presence> listPresence() {
		return this.presenceDao.listPresence();
	}

	@Override
	@Transactional
	public Presence getPresenceById(int id) {
		return this.presenceDao.getPresenceById(id);
	}

	@Override
	@Transactional
	public void removePresence(int id) {
		this.presenceDao.removePresence(id);	
	}
}
