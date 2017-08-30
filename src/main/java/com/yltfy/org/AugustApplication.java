package com.yltfy.org;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yltfy.org.model.City;
import com.yltfy.org.model.User;
import com.yltfy.org.repository.CityRepository;
import com.yltfy.org.repository.UserRepository;

@RequestMapping("/august")
@SpringBootApplication
public class AugustApplication {
	@Autowired
	private CityRepository cityRepository;
	@Autowired
	private UserRepository userRepository;

	@ResponseBody
	@RequestMapping("/find_all")
	public List<City> findAll() {
		return cityRepository.findAll();
	}

	@ResponseBody
	@RequestMapping("/find_by_name")
	public City findByName() {
		City city = cityRepository.findByNameIgnoringCase("sichuan");
		System.out.println(city);
		return city;
	}

	@ResponseBody
	@RequestMapping("/add")
	public City add() {
		City city = new City("sichuan", "成都");
		return cityRepository.save(city);
	}

	@ResponseBody
	@RequestMapping("/test")
	public String test() {
		return "success";
	}

	public static void main(String[] args) {
		SpringApplication.run(AugustApplication.class, args);
	}
}
