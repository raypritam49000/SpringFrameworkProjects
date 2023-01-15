package com.spring.mvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.mvc.entity.User;
import com.spring.mvc.services.UserServices;

@Controller
public class UserController {
	
	@Autowired
	private UserServices userService;

	@GetMapping("/")
	public String listOfUser(Model model) {
		List<User> users = userService.findAllUser();
		model.addAttribute("users", users);
		return "index";
	}
	
	@GetMapping("/addUser")
	public String addUser() {
		return "addUser";
	}
	
	@PostMapping("/addUser")
	public String handleAddUser(@ModelAttribute User user) {
		this.userService.createUser(user);
		return "redirect:/";
	}
	
	@GetMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable("id") int id) {
		this.userService.deleteUser(id);
		return "redirect:/";
	}
	
	@GetMapping("/updateUser/{id}")
	public String updateUser(@PathVariable("id") int id,Model model) {
		User user = this.userService.findById(id);
		model.addAttribute("user", user);
		return "updateUser";
	}
	
	@PostMapping("/updateUser")
	public String handleUpdateUser(@ModelAttribute User user) {
		this.userService.updateUser(user);
		return "redirect:/";
	}
}
