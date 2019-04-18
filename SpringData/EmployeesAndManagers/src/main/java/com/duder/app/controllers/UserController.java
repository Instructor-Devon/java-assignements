package com.duder.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.duder.app.UserService;
import com.duder.app.models.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	private UserService uService;
	@GetMapping("/")
	public List<User> Index() {
		List<User> users = this.uService.getAllUsers();
		return users;
	}
	@GetMapping("/{id}")
	public User Show(@PathVariable("id") Long id) {
		User user = this.uService.getOne(id);
		return user;
	}
}
