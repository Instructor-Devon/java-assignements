package com.duder.app.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.duder.app.models.Person;

public interface PersonRepository extends CrudRepository<Person, Long>{
	List<Person> findAll();
}
