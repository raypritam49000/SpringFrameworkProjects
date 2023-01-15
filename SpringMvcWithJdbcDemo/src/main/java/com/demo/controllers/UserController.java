package com.demo.controllers;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.demo.entity.User;
import com.demo.services.UserServices;

@Controller
public class UserController {
	private Logger logger = Logger.getLogger(UserController.class);

	@Autowired
	private UserServices userService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView listUserForm() {
		List<User> users = this.userService.findAll();
		logger.info("===>>> Going to UserController listUserForm method");
		ModelAndView model = new ModelAndView("listUser");
		model.addObject("users", users);
		return model;
	}

	@RequestMapping(value = "/addUserForm", method = RequestMethod.GET)
	public ModelAndView addUserForm() {
		logger.info("===>>> Going to UserController addUserForm method");
		ModelAndView model = new ModelAndView("addUser");
		return model;
	}

	@RequestMapping(value = "/createUser", method = RequestMethod.POST)
	public ModelAndView createUser(@ModelAttribute("user") User user) {
		logger.info("===>>> Going to UserController createUser method : " + user);
		this.userService.saveUser(user);
		ModelAndView model = new ModelAndView("redirect:/");
		return model;
	}

	@RequestMapping(value = "/deleteUser/{id}", method = RequestMethod.GET)
	public ModelAndView deleteUser(@PathVariable("id") int id) {
		logger.info("===>>> Going to UserController deleteUser method : " + id);
		this.userService.deleteUserById(id);
		ModelAndView model = new ModelAndView("redirect:/");
		return model;
	}

	@RequestMapping(value = "/updateUser/{id}", method = RequestMethod.GET)
	public ModelAndView updateUserForm(@PathVariable("id") int id) {
		logger.info("===>>> Going to UserController updateUserForm method : " + id);
		User user = this.userService.getUserById(id);
		ModelAndView model = new ModelAndView("updateUser");
		model.addObject("user", user);
		return model;
	}

	@RequestMapping(value = "/updateUser", method = RequestMethod.POST)
	public ModelAndView handleUpdateUser(@ModelAttribute("user") User user) {
		userService.updateUser(user);
		logger.info("===>>> Going to UserController handleUpdateUser method");
		ModelAndView model = new ModelAndView("redirect:/");
		return model;
	}

}