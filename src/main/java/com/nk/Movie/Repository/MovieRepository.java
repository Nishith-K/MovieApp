package com.nk.Movie.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nk.Movie.Entity.Movie;

import java.util.List;

@Repository
public interface MovieRepository extends CrudRepository<Movie,Long> {

}
