package com.zespolowy.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zespolowy.spring.model.Users;
import com.zespolowy.spring.service.UserService;

@Controller
public class test {

	private UserService userService;

	
	@Autowired(required=true)
	@Qualifier(value="userService")
	public void setUserService(UserService us) {
		this.userService = us;
	}
	
	 @RequestMapping(value = "/AddUser", method = RequestMethod.GET)
	 public String listUsers(Model model) {
		 model.addAttribute("user", new Users());
		 model.addAttribute("listUsers", this.userService.listUsers());
		 return "user";
	 }
	 
	 @RequestMapping(value ="/AddUser/add", method = RequestMethod.POST)
	 public String addUser(@ModelAttribute("user") Users u) {
		 if(u.getId() == 0)
			 this.userService.addUser(u);
		 else
			 this.userService.updateUser(u);
		 
		 return "redirect:/AddUser";
	 }
	 
	 @RequestMapping("/Aedit/{id}")
	 public String editUser(@PathVariable("id") int id, Model model) {
		 model.addAttribute("user", this.userService.getUserById(id));
		 model.addAttribute("listUsers", this.userService.listUsers());
		 return "AddUser";
	 }
	 
	 @RequestMapping("/Aremove/{id}")
	 public String removeUser(@PathVariable("id") int id) {
		 this.userService.removeUser(id);
		 return "redirect:/AddUser";
	 }
	 
}
