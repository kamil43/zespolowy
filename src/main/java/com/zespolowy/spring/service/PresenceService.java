package com.zespolowy.spring.service;
import java.util.List;

import com.zespolowy.spring.model.Presence;

public interface PresenceService {
	
	public void addPresence(Presence u);
	public void updatePresence(Presence u);
	public List<Presence> listPresence();
	public Presence getPresenceById(int id);
	public void removePresence(int id);
}
