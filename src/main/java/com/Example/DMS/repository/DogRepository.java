package com.Example.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.Example.DMS.Models.Dog;

/**
 * 
 * @author Bala Harinadh Palavelli
 *
 */
public interface DogRepository extends CrudRepository<Dog, Integer>{
	List<Dog> findByName(String name);

}
