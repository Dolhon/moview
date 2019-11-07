package com.dolhon.moview.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dolhon.moview.server.entity.MovieEntity;
import com.dolhon.moview.server.entity.UserWatchedMovieEntity;
import com.dolhon.moview.server.repository.MovieRepository;
import com.dolhon.moview.server.repository.UserWatchedMovieRepository;
import com.dolhon.moview.server.service.MovieService;

@RestController
public class MovieController {

	@Autowired 
	MovieRepository repository;

	@Autowired 
	UserWatchedMovieRepository userWatchedMovieRepository;
	
	@Autowired
	MovieService service;

	@RequestMapping(value = "/api/movies", method = RequestMethod.GET)
	public Iterable<MovieEntity> fetchMovies() {
		return repository.findAll();
	}
	
	@RequestMapping(value = "/api/movies/watched", method = RequestMethod.GET)
	public Iterable<UserWatchedMovieEntity> fetchUsersWatchedMovies() {
		return userWatchedMovieRepository.findAllByUserId(1L);
	}
	
	@RequestMapping(value = "/api/movies/{id}/watched", method = RequestMethod.POST)
	public void saveWatchedMovie(@PathVariable Long id) {
		
		service.saveWatchedMovie(id);
	}
}
