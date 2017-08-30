package com.yltfy.org.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yltfy.org.model.User;
import com.yltfy.org.repository.UserRepository;

@RestController
@RequestMapping("/sample")
public class SampleContrller {
	@Autowired
	private UserRepository userRepository;

	@RequestMapping("/success")
	@ResponseBody
	public String test_success() {
		return "test success";
	}

	@RequestMapping("/all_users")
	@ResponseBody
	public List<User> all_users() {
		return userRepository.findAll();
	}
}
