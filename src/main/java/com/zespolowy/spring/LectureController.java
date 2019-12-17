package com.zespolowy.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zespolowy.spring.model.Lecture;
import com.zespolowy.spring.service.LectureService;

@Controller
public class LectureController {

	private LectureService lectureService;
	
	@Autowired(required=true)
	@Qualifier(value="lectureService")
	public void setLectureService(LectureService ls) {
		this.lectureService = ls;
	}
	
	@RequestMapping(value="/lectures", method = RequestMethod.GET)
	public String listLectures(Model model) {
		model.addAttribute("lecture", new Lecture());
		model.addAttribute("listLectures", this.lectureService.listLectures());
		return "lecture";
	}
	
	@RequestMapping(value = "/lecture/add", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("lecture") Lecture l) {
		if(l.getId() == 0)
			this.lectureService.addLecture(l);
		else
			this.lectureService.updateLecture(l);
		return "redirect:/lectures";
	}
	
	@RequestMapping("/editl/{id}")
	public String editLecture(@PathVariable("id") int id, Model model) {
		model.addAttribute("lecture", this.lectureService.getLectureById(id));
		model.addAttribute("listLectures", this.lectureService.listLectures());
		return "lecture";
	}
	
	@RequestMapping("/removel/{id}")
	public String removeLecture(@PathVariable("id") int id) {
		this.lectureService.removeLecture(id);
		return "redirect:/lectures";
	}
}
