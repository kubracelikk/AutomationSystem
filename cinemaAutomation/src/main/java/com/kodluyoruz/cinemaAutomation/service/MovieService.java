package com.kodluyoruz.cinemaAutomation.service;



import com.kodluyoruz.cinemaAutomation.dto.movie.CreateMovieDto;
import com.kodluyoruz.cinemaAutomation.dto.movie.MovieDto;
import com.kodluyoruz.cinemaAutomation.dto.movie.UpdateMovieDto;

import java.util.List;

public interface MovieService {

	MovieDto create(CreateMovieDto createMovieDto);

	List<MovieDto> getAllMovie();

	MovieDto update(Long id, UpdateMovieDto updateMovieDto);

	MovieDto getById(Long id);

	void delete(Long id);

}
