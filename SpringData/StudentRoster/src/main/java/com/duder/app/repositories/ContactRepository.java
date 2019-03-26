package com.duder.app.repositories;

import org.springframework.data.repository.CrudRepository;

import com.duder.app.models.Contact;

public interface ContactRepository extends CrudRepository<Contact, Long>{
	
}
