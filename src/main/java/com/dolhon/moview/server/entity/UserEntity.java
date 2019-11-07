package com.dolhon.moview.server.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="mw_user")
public class UserEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	String name;
	
	@OneToMany(mappedBy = "user")
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
	
	@JsonIgnore
	public Set<UserWatchedMovieEntity> getWatchedMovie() {
		return watchedMovies;
	}

	public void setWatchedMovie(Set<UserWatchedMovieEntity> watchedMovie) {
		this.watchedMovies = watchedMovie;
	}
}
