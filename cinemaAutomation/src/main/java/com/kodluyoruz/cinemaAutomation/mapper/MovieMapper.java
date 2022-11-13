package com.kodluyoruz.cinemaAutomation.mapper;




import org.springframework.stereotype.Component;

import com.kodluyoruz.cinemaAutomation.dto.movie.CreateMovieDto;
import com.kodluyoruz.cinemaAutomation.dto.movie.MovieDto;
import com.kodluyoruz.cinemaAutomation.dto.movie.UpdateMovieDto;
import com.kodluyoruz.cinemaAutomation.entities.Movie;

import java.util.ArrayList;
import java.util.List;

@Component
public class MovieMapper {

    public Movie toCreateEntity(CreateMovieDto createMovieDto) {
        Movie movie = new Movie();

        movie.setTitle(createMovieDto.getTitle());
        movie.setDescription(createMovieDto.getDescription());
        movie.setGenre(createMovieDto.getGenre());

        return movie;
    }

    public Movie toUpdateEntity(Movie movie, UpdateMovieDto updateMovieDto) {
        movie.setTitle(updateMovieDto.getTitle());
        movie.setDescription(updateMovieDto.getDescription());
        movie.setGenre(updateMovieDto.getGenre());

        return movie;
    }

    public MovieDto toDto(Movie movie) {
        MovieDto movieDto = new MovieDto();

        movieDto.setId(movie.getId());
        movieDto.setTitle(movie.getTitle());
        movieDto.setDescription(movie.getDescription());
        movieDto.setGenre(movie.getGenre());

        return movieDto;
    }

    public List<MovieDto> toDto(List<Movie> movieList) {
        List<MovieDto> movieDtoList = new ArrayList<>();

        movieList.forEach(movie -> {
            MovieDto movieDto = new MovieDto();

            movieDto.setId(movie.getId());
            movieDto.setTitle(movie.getTitle());
            movieDto.setDescription(movie.getDescription());
            movieDto.setGenre(movie.getGenre());

            movieDtoList.add(movieDto);
        });

        return movieDtoList;
    }

}

