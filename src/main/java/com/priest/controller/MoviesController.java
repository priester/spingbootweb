package com.priest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.priest.dto.Movie;

@RestController
public class MoviesController {

	// Spring Boot的web Starter集成了Spring MVC
	// Spring MVC的自动配置在包 org.springframework.boot.autoconfigure.web 之下
	@RequestMapping("/show/movie")
	public Movie show() {
		Movie movie = new Movie();
		return movie;
	}
}
