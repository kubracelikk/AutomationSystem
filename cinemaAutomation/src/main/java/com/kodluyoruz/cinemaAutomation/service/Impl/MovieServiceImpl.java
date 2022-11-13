package com.kodluyoruz.cinemaAutomation.service.Impl;


import com.kodluyoruz.cinemaAutomation.dto.movie.CreateMovieDto;
import com.kodluyoruz.cinemaAutomation.dto.movie.MovieDto;
import com.kodluyoruz.cinemaAutomation.dto.movie.UpdateMovieDto;
import com.kodluyoruz.cinemaAutomation.entities.Movie;
import com.kodluyoruz.cinemaAutomation.mapper.MovieMapper;
import com.kodluyoruz.cinemaAutomation.repository.MovieRepository;
import com.kodluyoruz.cinemaAutomation.service.MovieService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository movieRepository;

	@Autowired
	private MovieMapper movieMapper;

	@Override
	public MovieDto create(CreateMovieDto createMovieDto) {
		Movie movie = movieMapper.toCreateEntity(createMovieDto);
		return movieMapper.toDto(movieRepository.save(movie));
	}

	@Override
	public List<MovieDto> getAllMovie() {

		return movieMapper.toDto(movieRepository.findAll());
	}

	@Override
	public MovieDto update(Long id, UpdateMovieDto updateMovieDTO) {
		Movie movie = movieRepository.getReferenceById(id);
		movie = movieMapper.toUpdateEntity(movie, updateMovieDTO);

		return movieMapper.toDto(movieRepository.save(movie));
	}

	@Override
	public MovieDto getById(Long id) {
		return movieMapper.toDto(movieRepository.getReferenceById(id));
	}

	

	@Override
	public void delete(Long id) {
		movieRepository.deleteById(id);
	}

}
