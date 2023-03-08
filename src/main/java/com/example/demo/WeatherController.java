package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
public class WeatherController {
@Autowired
WeatherRepo serviceRepository;
@Autowired
WeatherService service;
@GetMapping("/get")
List<Weather> getlist(){
	return serviceRepository.findAll();
}
@PutMapping("/")
public String update(@RequestBody Weather wea) {
	return service.updateDetails(wea);
}
@DeleteMapping("/delete")
public String delete(@RequestParam int temperature) {
	return service.deleteDetails(temperature);
}
@PostMapping("/post")
public Weather create(@RequestBody Weather wea) {
return serviceRepository.save(wea);
}
}

