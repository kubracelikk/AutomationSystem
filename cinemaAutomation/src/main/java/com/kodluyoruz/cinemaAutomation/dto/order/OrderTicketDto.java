package com.kodluyoruz.cinemaAutomation.dto.order;

	import com.kodluyoruz.cinemaAutomation.dto.movie.MovieDto;
	import lombok.Data;

	@Data
	public class OrderTicketDto {

	    private Long id;

	    private int row;

	    private int seat;

	    private double price;

	    private MovieDto movie;

	}


