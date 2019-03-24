package com.duder.languages.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.duder.languages.models.Language;

public interface LanguagesRepository extends CrudRepository<Language, Long>{
	List<Language> findAll();
}
