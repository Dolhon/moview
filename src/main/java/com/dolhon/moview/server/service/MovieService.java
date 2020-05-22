package com.dolhon.moview.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dolhon.moview.server.entity.MovieEntity;
import com.dolhon.moview.server.entity.UserEntity;
import com.dolhon.moview.server.entity.UserWatchedMovieEntity;
import com.dolhon.moview.server.repository.MovieRepository;
import com.dolhon.moview.server.repository.UserWatchedMovieRepository;

@Service
public class MovieService {

	@Autowired
	MovieRepository repository;

	@Autowired
	UserWatchedMovieRepository userWatchedMovieRepository;

	public void saveWatchedMovie(Long id) {

		UserWatchedMovieEntity entity = new UserWatchedMovieEntity();
		MovieEntity movie = new MovieEntity();
		UserEntity user = new UserEntity();

		movie.setId(id);
		user.setId(1L);

		entity.setMovie(movie);
		entity.setUser(user);

		userWatchedMovieRepository.save(entity);
	}

	public Iterable<MovieEntity> fetchMovies() {
		return repository.findAll();
	}

	public Iterable<UserWatchedMovieEntity> fetchUserWatchedMovies(long usedId) {
		return userWatchedMovieRepository.findAllByUserId(usedId);
	}
}
