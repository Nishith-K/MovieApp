import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { GetMoviesComponent } from './get-movies/get-movies.component';
import { MovieDetailsComponent } from './movie-details/movie-details.component';

import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NavigationComponent } from './navigation/navigation.component';
import { Router, RouterModule, Routes} from "@angular/router";

const appRoutes :Routes = [
  {
    path:'movies',
    component: GetMoviesComponent
  }
]
@NgModule({
  declarations: [
    AppComponent,
    GetMoviesComponent,
    MovieDetailsComponent,
    NavigationComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    HttpClientModule,
    RouterModule.forRoot(appRoutes),
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
