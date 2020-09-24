package com.nk.Movie.Service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.nk.Movie.Entity.Movie;

@Component
public interface MovieService {
	
	public Movie findByMovieId(Integer id);
    
	public List<Movie> getMovies();
}
