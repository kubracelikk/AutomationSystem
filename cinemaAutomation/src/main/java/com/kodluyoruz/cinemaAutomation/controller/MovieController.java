package com.kodluyoruz.cinemaAutomation.controller;



import com.kodluyoruz.cinemaAutomation.dto.movie.CreateMovieDto;
import com.kodluyoruz.cinemaAutomation.dto.movie.MovieDto;
import com.kodluyoruz.cinemaAutomation.dto.movie.UpdateMovieDto;
import com.kodluyoruz.cinemaAutomation.service.MovieService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
@RequestMapping("/api/movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/getAll")
    public List<MovieDto> getAll() {
        return movieService.getAllMovie();
    }

    @PostMapping("/getSave")
    public MovieDto create(@RequestBody CreateMovieDto createMovieDto) {
        return movieService.create(createMovieDto);
    }

    @GetMapping("/{id}")
    public MovieDto getById(@PathVariable Long id) {
        return movieService.getById(id);
    }

    

    @PutMapping("/{id}")
    public MovieDto update(@PathVariable Long id, @RequestBody UpdateMovieDto updateMovieDto) {
        return movieService.update(id, updateMovieDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        movieService.delete(id);
    }

}


