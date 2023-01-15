package com.spring.mvc.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mvc.entity.User;
import com.spring.mvc.services.UserServices;

@RestController
public class UserController {

	@Autowired
	private UserServices userService;

	@GetMapping("/getAllUsers")
	public List<User> listOfUser() {
		List<User> users = userService.findAllUser();
		return users;
	}

	@GetMapping("/getUser/{id}")
	public User findUserById(@PathVariable("id") int id) {
		User user = userService.findById(id);
		return user;
	}

	@PostMapping("/addUser")
	public User handleAddUser(@RequestBody User user) {
		User createdUser = this.userService.createUser(user);
		return createdUser;
	}

	@DeleteMapping("/deleteUser/{id}")
	public Map<?, ?> deleteUser(@PathVariable("id") int id) {
		Boolean isDeleted = this.userService.deleteUser(id);
		if (isDeleted) {
			return Map.of("message", "User Deleted", "success", true, "statusCode", 203);
		} else {
			return Map.of("message", "User Not Deleted", "success", false, "statusCode", 400);
		}
	}

	@PutMapping("/updateUser")
	public Map<?, ?> handleUpdateUser(@RequestBody User user) {
		Boolean isUpdated = this.userService.updateUser(user);
		if (isUpdated) {
			return Map.of("message", "User Updated", "success", true, "statusCode", 204);
		} else {
			return Map.of("message", "User Not Updated", "success", false, "statusCode", 400);
		}
	}
}
