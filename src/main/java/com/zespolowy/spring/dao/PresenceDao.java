package com.zespolowy.spring.dao;

import java.util.List;

import com.zespolowy.spring.model.Presence;

public interface PresenceDao {
	public void addPresence(Presence u);
	public void updatePresence(Presence u);
	public List<Presence> listPresence();
	public Presence getPresenceById(int id);
	public void removePresence(int it);
}
