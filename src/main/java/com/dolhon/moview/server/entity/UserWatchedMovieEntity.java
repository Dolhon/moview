package com.dolhon.moview.server.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="mw_user_watched_table")
public class UserWatchedMovieEntity {
	
	@ManyToOne
	@Column(name="movie_id")
	MovieEntity movie;

	@ManyToOne
	@Column(name="user_id")
	UserEntity user;

	public MovieEntity getMovie() {
		return movie;
	}

	public void setMovie(MovieEntity movie) {
		this.movie = movie;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}
	
}
