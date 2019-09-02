package com.jen.relationships.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jen.relationships.models.Person;

public interface PersonRepository extends CrudRepository<Person, Long>{
	
	List<Person> findAll();
	
}