package com.yltfy.org;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yltfy.model.City;
import com.yltfy.repository.CityRepository;

@Controller
@RequestMapping("/sample")
@SpringBootApplication
@EnableAutoConfiguration
public class AugustApplication {
	private CityRepository cityRepository;

	@ResponseBody
	@RequestMapping("/find_all")
	public List<City> findAll() {
		return cityRepository.findAll();
	}

	@ResponseBody
	@RequestMapping("/add")
	public City add() {
		City city = new City("四川", "成都");
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
