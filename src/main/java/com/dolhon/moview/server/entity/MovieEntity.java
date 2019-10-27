package com.dolhon.moview.server.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="mw_movie")
public class MovieEntity {
	
	Long id;
	String name;
	float rating;
	
	@OneToMany
	@Column(name="user_watched_movie")
	Set<UserWatchedMovieEntity> watchedMovie;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public Set<UserWatchedMovieEntity> getWatchedMovie() {
		return watchedMovie;
	}

	public void setWatchedMovie(Set<UserWatchedMovieEntity> watchedMovie) {
		this.watchedMovie = watchedMovie;
	}
}
