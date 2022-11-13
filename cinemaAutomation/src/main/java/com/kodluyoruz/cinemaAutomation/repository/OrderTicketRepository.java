package com.kodluyoruz.cinemaAutomation.repository;


    import com.kodluyoruz.cinemaAutomation.entities.OrderTicket;
	import org.springframework.data.jpa.repository.JpaRepository;



	public interface OrderTicketRepository extends JpaRepository<OrderTicket, Long> {
	}

