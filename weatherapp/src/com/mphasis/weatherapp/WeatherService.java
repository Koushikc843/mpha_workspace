package com.mphasis.weatherapp;

public class WeatherService {
	public String getWeather(String city) {
		if(city.equals("pune")) {
			return "Hot....sunny weather";
		}
		if(city.equals("Bang")) {
			return "cold....sunny weather";
		}
		else {
			return "unknown";
		}
	}

}
