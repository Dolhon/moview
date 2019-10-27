package com.dolhon.moview.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dolhon.moview.server.entity.MovieEntity;
import com.dolhon.moview.server.repository.MovieRepository;

@Service
public class MovieService {

	@Autowired MovieRepository repository;

	public void printMovie() {
		Optional<MovieEntity> entity = repository.findById(1);
		
		entity.ifPresent(movie -> {
		    System.out.println("Movie: " + movie.getName());    
		});
	}
	
}
