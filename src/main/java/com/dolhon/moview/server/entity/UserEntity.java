package com.dolhon.moview.server.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="mw_user")
public class UserEntity {

	Long id;
	String name;
	
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

	public Set<UserWatchedMovieEntity> getWatchedMovie() {
		return watchedMovie;
	}

	public void setWatchedMovie(Set<UserWatchedMovieEntity> watchedMovie) {
		this.watchedMovie = watchedMovie;
	}
}
