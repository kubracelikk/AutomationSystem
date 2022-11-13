package com.kodluyoruz.cinemaAutomation.repository;


	
    import com.kodluyoruz.cinemaAutomation.entities.Movie;
	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


	public interface MovieRepository extends JpaRepository<Movie, Long>, JpaSpecificationExecutor<Movie> {
	}


