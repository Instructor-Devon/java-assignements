package com.duder.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duder.app.models.User;
import com.duder.app.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository uRepo;
	public List<User> getAllUsers() {
		return this.uRepo.findAll();
	}
	public User getOne(Long id) {
		return this.uRepo.findById(id).orElse(null);
	}
}
