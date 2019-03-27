package com.duder.app.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.duder.app.models.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Long>{
	List<Ninja> findAll();
}
