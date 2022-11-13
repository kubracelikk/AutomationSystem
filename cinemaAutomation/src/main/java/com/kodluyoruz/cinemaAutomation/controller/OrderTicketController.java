package com.kodluyoruz.cinemaAutomation.controller;



import com.kodluyoruz.cinemaAutomation.dto.order.CreateOrderTicketDto;
import com.kodluyoruz.cinemaAutomation.dto.order.OrderTicketDto;
import com.kodluyoruz.cinemaAutomation.dto.order.UpdateOrderTicketDto;
import com.kodluyoruz.cinemaAutomation.service.OrderTicketService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/order")
public class OrderTicketController {

	@Autowired
	private OrderTicketService orderTicketService;

	@PostMapping
	public OrderTicketDto create(@RequestBody CreateOrderTicketDto createOrderTicketDto) {
		return orderTicketService.create(createOrderTicketDto);
	}

	@GetMapping("/{id}")
	public OrderTicketDto getById(@PathVariable Long id) {
		return orderTicketService.getById(id);
	}


	@PutMapping("/{id}")
	public OrderTicketDto update(@PathVariable Long id, @RequestBody UpdateOrderTicketDto updateOrderTicketDto) {
		return orderTicketService.update(id, updateOrderTicketDto);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		orderTicketService.delete(id);
	}
}
