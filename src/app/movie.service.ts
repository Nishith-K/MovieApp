import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MovieService {
  private baseUrl = 'http://localhost:8080/api/movies';

    constructor(private http: HttpClient) { }

    public getMovies() {
      return this.http.get(`${this.baseUrl}`);
    }
}
