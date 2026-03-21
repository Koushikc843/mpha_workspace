package com.mphasis.productmanagerapp.controller;

import java.io.IOException;

import com.mphasis.weatherapp.WeatherService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/weathercontroller")
public class WeatherController extends HttpServlet {
	private WeatherService weatherService;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String city=req.getParameter("city");
		String weather=weatherService.getWeather(city);
		RequestDispatcher rd=req.getRequestDispatcher("WEB-INF/view/weather.jsp");
		rd.forward(req, resp);
	}

}
