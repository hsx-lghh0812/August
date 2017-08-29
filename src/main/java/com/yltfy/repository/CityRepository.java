package com.yltfy.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.yltfy.model.City;

public interface CityRepository extends Repository<City, Long> {

	City save(City city);

	List<City> findAll();

	@Query("select * from city where name = ?1 and state = ?2")
	City findByNameAndCountryAllIgnoringCase(String name, String state);
}
