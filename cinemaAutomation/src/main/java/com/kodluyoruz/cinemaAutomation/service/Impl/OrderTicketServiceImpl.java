package com.kodluyoruz.cinemaAutomation.service.Impl;



import com.kodluyoruz.cinemaAutomation.dto.order.CreateOrderTicketDto;
import com.kodluyoruz.cinemaAutomation.dto.order.OrderTicketDto;
import com.kodluyoruz.cinemaAutomation.dto.order.UpdateOrderTicketDto;
import com.kodluyoruz.cinemaAutomation.entities.Movie;
import com.kodluyoruz.cinemaAutomation.entities.OrderTicket;
import com.kodluyoruz.cinemaAutomation.mapper.OrderTicketMapper;
import com.kodluyoruz.cinemaAutomation.repository.MovieRepository;
import com.kodluyoruz.cinemaAutomation.repository.OrderTicketRepository;
import com.kodluyoruz.cinemaAutomation.service.OrderTicketService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



//import javax.persistence.EntityManager;


@Service
@Transactional
public class OrderTicketServiceImpl implements OrderTicketService {

    @Autowired
    private OrderTicketRepository orderTicketRepository;

    @Autowired
    private MovieRepository movieRepository;

   // @Autowired
   // private EntityManager entityManager;

    @Autowired
    private OrderTicketMapper orderTicketMapper;

    @Override
    public OrderTicketDto create(CreateOrderTicketDto createOrderTicketDto) {
        OrderTicket orderTicket = orderTicketMapper.toCreateEntity(createOrderTicketDto);

        Movie movie = movieRepository.getReferenceById(createOrderTicketDto.getMovieId());
        orderTicket.setMovie(movie);

        return orderTicketMapper.toDto(orderTicketRepository.save(orderTicket));
    }

    @Override
    public OrderTicketDto update(Long id, UpdateOrderTicketDto updateOrderTicketDto) {
        OrderTicket orderTicket = orderTicketRepository.getReferenceById(id);

        orderTicket = orderTicketMapper.toUpdateEntity(orderTicket, updateOrderTicketDto);

        Long movieId = updateOrderTicketDto.getMovieId();

        if (movieId != null) {
        	 
            Movie movie = movieRepository.getById(movieId);
            orderTicket.setMovie(movie);
        }

        return orderTicketMapper.toDto(orderTicketRepository.save(orderTicket));
    }

    @Override
    public OrderTicketDto getById(Long id) {
        return orderTicketMapper.toDto(orderTicketRepository.getReferenceById(id));
    }

   
    @Override
    public void delete(Long id) {
        orderTicketRepository.deleteById(id);
    }

    
    

}
