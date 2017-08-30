package com.yltfy.org.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.yltfy.org.model.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

	City save(City city);

	List<City> findAll();

//	@Query("select c from City c where c.name = ?1")
	City findByNameIgnoringCase(String name);
}
