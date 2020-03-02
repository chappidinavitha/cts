package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Movie;

@RestController
@RequestMapping("/movies")
public class MovieController {
	private static List<Movie> movieList=new ArrayList<>();
    static{
    	movieList.add(new Movie(1, "movie-1", "summary-1"));
        movieList.add(new Movie(2, "movie-2", "summary-2"));
        movieList.add(new Movie(3, "movie-3", "summary-3"));
    }
    @GetMapping("/movies")
    public ResponseEntity<?> getMovies()
    {
		return ResponseEntity.ok(movieList);
    	
    }
    public ResponseEntity<?> getMovie(@PathVariable int id){
    	Movie movie = findMovie(id);
    	if(movie==null) {
    		return ResponseEntity.badRequest().body("invalid movie id");
    	}
    	
      return ResponseEntity.ok(movie);
    
    	
		
    	
    }
	private Movie findMovie(int id) {
        return movieList.stream()
                .filter(movie -> movie.getId()
                    .equals(id))
                .findFirst()
                .orElse(null);

		
	}
    
}