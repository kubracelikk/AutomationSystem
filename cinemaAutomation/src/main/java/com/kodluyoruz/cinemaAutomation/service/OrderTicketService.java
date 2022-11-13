package com.kodluyoruz.cinemaAutomation.service;



import com.kodluyoruz.cinemaAutomation.dto.order.CreateOrderTicketDto;
import com.kodluyoruz.cinemaAutomation.dto.order.OrderTicketDto;
import com.kodluyoruz.cinemaAutomation.dto.order.UpdateOrderTicketDto;





public interface OrderTicketService {

	OrderTicketDto create(CreateOrderTicketDto createOrderTicketDto);

	OrderTicketDto update(Long id, UpdateOrderTicketDto updateOrderTicketDto);

	OrderTicketDto getById(Long id);

	void delete(Long id);

}
