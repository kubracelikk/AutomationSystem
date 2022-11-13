package com.kodluyoruz.cinemaAutomation.repository;


	
    import com.kodluyoruz.cinemaAutomation.entities.Movie;
	import org.springframework.data.jpa.repository.JpaRepository;


	public interface MovieRepository extends JpaRepository<Movie, Long> {
	}


