package com.duder.app.services;

import org.mindrot.jbcrypt.BCrypt;
import com.duder.app.models.User;
import org.springframework.stereotype.Service;

import com.duder.app.repositories.UserRepository;

@Service
public class UserService {
	private final UserRepository userRepo;
	public UserService(UserRepository userRepo) {
		this.userRepo = userRepo;
	}
	public User registerUser(User user) {
		String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		user.setPassword(hashed);
		return this.userRepo.save(user);
	}
	public User findByEmail(String email) {
		return this.userRepo.findByEmail(email);
	}
	public User findById(Long id) {
		return this.userRepo.findById(id).orElse(null);
	}
	public boolean authenticateUser(String email, String password) {
		User user = this.userRepo.findByEmail(email);
		if(user == null) return false;
		return BCrypt.checkpw(password, user.getPassword());
	}
	
}
