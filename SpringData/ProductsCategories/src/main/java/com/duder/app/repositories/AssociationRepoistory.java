package com.duder.app.repositories;

import org.springframework.data.repository.CrudRepository;

import com.duder.app.models.Association;

public interface AssociationRepoistory extends CrudRepository<Association, Long>{

}
