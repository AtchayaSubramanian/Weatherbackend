package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class WeatherService {
	@Autowired
	WeatherRepo repository;
	
	public String updateDetails(Weather wea) {
		repository.save(wea);
		return "updated";
	}

	public String deleteDetails(int temperature) {
		repository.deleteById(temperature);
		return "Id deleted";

	}
}

