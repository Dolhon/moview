package com.dolhon.moview.server.repository;

import org.springframework.data.repository.CrudRepository;

import com.dolhon.moview.server.entity.MovieEntity;

public interface MovieRepository extends CrudRepository<MovieEntity, Integer> {

}
