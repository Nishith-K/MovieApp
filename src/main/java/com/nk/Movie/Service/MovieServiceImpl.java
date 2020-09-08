package com.nk.Movie.Service;

import com.nk.Movie.Entity.Movie;
import com.nk.Movie.Repository.MovieRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService{

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public List<Movie> getMovies(){
        return (List<Movie>) movieRepository.findAll();
    }
}
