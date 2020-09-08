package com.nk.Movie.Controller;

import com.nk.Movie.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

	@Autowired
	private MovieService movieService;

	@GetMapping("/getMovies")
	public String getResult() {
		movieService.getMovies();
		return "Movies!!";
	}
}
