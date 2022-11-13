package com.kodluyoruz.cinemaAutomation.dto.movie;


	import lombok.AllArgsConstructor;
	import lombok.Data;
	import lombok.NoArgsConstructor;

	@NoArgsConstructor
	@AllArgsConstructor
	@Data
	public class UpdateMovieDto {

	    private String title;

	    private String description;

	    private String genre;

	}

