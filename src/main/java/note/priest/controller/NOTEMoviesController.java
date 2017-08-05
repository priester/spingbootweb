package note.priest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

import com.priest.dto.Movie;

//@RestController
public class NOTEMoviesController {

	@Value("${defaultTitle}")
	private String defaultTitle;
	
	@Value("${defaultMovie}")
	private String defaultMovie;
	
	@Autowired
	private MovieProperties movieProperties;
	

	// Spring Boot的web Starter集成了Spring MVC
	// Spring MVC的自动配置在包 org.springframework.boot.autoconfigure.web 之下
	@RequestMapping("/show/movie")
	public Movie show() {

		Movie movie = new Movie();
		movie.setTitle(defaultTitle);
		return movie;
	}
	
	@RequestMapping("/show/movie2")
	public String show2() {
		return defaultMovie;
	}
	
	
	@RequestMapping("/show/movie3")
	public MovieProperties show3() {
		return movieProperties;
	}
}
