package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
public interface WeatherRepo extends JpaRepository<Weather,Integer>{

}
