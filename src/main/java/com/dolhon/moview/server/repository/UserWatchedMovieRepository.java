package com.dolhon.moview.server.repository;

import org.springframework.data.repository.CrudRepository;

import com.dolhon.moview.server.entity.UserWatchedMovieEntity;

public interface UserWatchedMovieRepository extends CrudRepository<UserWatchedMovieEntity, Long> {
	
	public Iterable<UserWatchedMovieEntity> findAllByUserId(Long user);
}
