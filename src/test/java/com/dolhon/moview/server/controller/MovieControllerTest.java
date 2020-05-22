package com.dolhon.moview.server.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.dolhon.moview.server.entity.MovieEntity;
import com.dolhon.moview.server.service.MovieService;

@WebMvcTest(MovieController.class)
public class MovieControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	 
	@MockBean
    private MovieService service;
    
    Iterable<MovieEntity> movies;
    MovieEntity movie;
    
    @Before
    public void setup() {
    	movies = new ArrayList<>();
    	movie = new MovieEntity();
    }
    
    @Test
    public void shouldReturnAllMoviesFromService() throws Exception {
    	when(service.fetchMovies()).thenReturn(movies);
		this.mockMvc.perform(get("/api/movies"))
		.andExpect(status().isOk());
	}
}
