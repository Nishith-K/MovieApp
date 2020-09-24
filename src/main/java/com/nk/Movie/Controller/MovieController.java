package com.nk.Movie.Controller;

import com.nk.Movie.Entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nk.Movie.Service.MovieService;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import java.util.List;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class MovieController {

	@Autowired
	private MovieService movieService;


//	@GetMapping(value = {"/", "/index"})
//	public String index(Model model) {
//	    model.addAttribute("title", "MovieDB");
//	    return "index";
//	}
	@GetMapping(value="/movies")
	public List<Movie> getResult() {
		return movieService.getMovies();
	}
}
