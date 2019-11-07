package com.dolhon.moview.server.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="mw_movie")
public class MovieEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	String name;
	float rating;
	
	@OneToMany(mappedBy = "movie")
	@JsonManagedReference
	Set<UserWatchedMovieEntity> watchedMovies;

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
		return watchedMovies;
	}

	public void setWatchedMovie(Set<UserWatchedMovieEntity> watchedMovie) {
		this.watchedMovies = watchedMovie;
	}
}
