package com.nk.Movie.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nk.Movie.Entity.Movie;

@Repository
public abstract class MovieRepository implements CrudRepository<Movie,Long> {
	

}
