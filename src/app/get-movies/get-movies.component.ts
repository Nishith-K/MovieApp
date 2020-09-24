import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import {Movie} from '../movie';
//import {MovieService} from '../movie.service';
@Component({
  selector: 'get-movies',
  templateUrl: './get-movies.component.html',
  styleUrls: ['./get-movies.component.css']
})
export class GetMoviesComponent implements OnInit {

  movies: Movie[]=[];
  constructor(private http: HttpClient) {
  }

  ngOnInit() {
    this.getMovies();
  }
  public getMovies(){
    let baseUrl = 'http://localhost:8080/api/movies';
    this.http.get<Movie[]>(baseUrl).subscribe(
      response=>{
        this.movies = response;
      }
    );
  }

  //onSubmit(){
    //this.getMovies();
  //}

}
