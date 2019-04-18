package com.duder.app.repositories;

import org.springframework.data.repository.CrudRepository;

import com.duder.app.models.Answer;

public interface AnswerRepository extends CrudRepository<Answer, Long>{
	
}
