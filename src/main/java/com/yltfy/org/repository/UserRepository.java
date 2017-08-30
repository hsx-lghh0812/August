package com.yltfy.org.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.yltfy.org.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User save(User user);

	List<User> findAll();

	// @Query("select c from City c where c.name = ?1")
	User findByUsernameIgnoringCase(String username);
}
