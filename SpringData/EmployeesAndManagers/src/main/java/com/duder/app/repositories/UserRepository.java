package com.duder.app.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.duder.app.models.User;

public interface UserRepository extends CrudRepository<User, Long>{
	List<User> findAll();
}
