package com.nk.Movie.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.nk.Movie.Entity.Movie;
import com.nk.Movie.Repository.MovieRepository;

@Service("movieServiceImpl")
public class MovieServiceImpl implements MovieService{

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getMovies(){
        return (List<Movie>) movieRepository.findAll();
    }

	@Override
	public Movie findByMovieId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
}
