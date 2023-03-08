package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Weather {
	@Id
	private int temperature;
    private String humidity;
    private String windy;
    private String outlook;
    private String location;
    
	public Weather(int temperature, String humidity, String windy, String outlook,String location) {
		super();
		this.temperature = temperature;
		this.humidity = humidity;
		this.windy = windy;
		this.outlook = outlook;
		this.location =location;
	}
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public String getHumidity() {
		return humidity;
	}
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	public String getWindy() {
		return windy;
	}
	public void setWindy(String windy) {
		this.windy = windy;
	}
	public String getOutlook() {
		return outlook;
	}
	public void setOutlook(String outlook) {
		this.outlook = outlook;
		
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Weather() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	
}