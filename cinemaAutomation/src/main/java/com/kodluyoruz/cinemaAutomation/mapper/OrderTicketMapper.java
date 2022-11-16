package com.kodluyoruz.cinemaAutomation.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kodluyoruz.cinemaAutomation.dto.order.CreateOrderTicketDto;
import com.kodluyoruz.cinemaAutomation.dto.order.OrderTicketDto;
import com.kodluyoruz.cinemaAutomation.dto.order.UpdateOrderTicketDto;
import com.kodluyoruz.cinemaAutomation.entities.OrderTicket;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderTicketMapper {

	@Autowired
	private MovieMapper movieMapper;

	public OrderTicket toCreateEntity(CreateOrderTicketDto createOrderTicketDto) {
		OrderTicket orderTicket = new OrderTicket();

		orderTicket.setName(createOrderTicketDto.getName());
		orderTicket.setLastName(createOrderTicketDto.getLastName());
		orderTicket.setRowPlace(createOrderTicketDto.getRow());
		orderTicket.setSeat(createOrderTicketDto.getSeat());
		orderTicket.setPrice(createOrderTicketDto.getPrice());

		return orderTicket;
	}

	public OrderTicket toUpdateEntity(OrderTicket orderTicket, UpdateOrderTicketDto updateOrderTicketDto) {
		orderTicket.setRowPlace(updateOrderTicketDto.getRow());
		orderTicket.setSeat(updateOrderTicketDto.getSeat());
		orderTicket.setPrice(updateOrderTicketDto.getPrice());

		return orderTicket;
	}

	public OrderTicketDto toDto(OrderTicket orderTicket) {
		OrderTicketDto orderTicketDto = new OrderTicketDto();

		orderTicketDto.setId(orderTicket.getId());
		orderTicketDto.setName(orderTicket.getName());
		orderTicketDto.setLastName(orderTicket.getLastName());
		orderTicketDto.setRow(orderTicket.getRowPlace());
		orderTicketDto.setSeat(orderTicket.getSeat());
		orderTicketDto.setPrice(orderTicket.getPrice());
		orderTicketDto.setMovie(movieMapper.toDto(orderTicket.getMovie()));

		return orderTicketDto;
	}

	public List<OrderTicketDto> toDto(List<OrderTicket> orderTicketList) {
		List<OrderTicketDto> orderTicketDtoList = new ArrayList<>();

		orderTicketList.forEach(orderTicket -> {
			OrderTicketDto orderTicketDto = new OrderTicketDto();

			orderTicketDto.setId(orderTicket.getId());
			orderTicketDto.setName(orderTicket.getName());
			orderTicketDto.setLastName(orderTicket.getLastName());
			orderTicketDto.setRow(orderTicket.getRowPlace());
			orderTicketDto.setSeat(orderTicket.getSeat());
			orderTicketDto.setPrice(orderTicket.getPrice());
			orderTicketDto.setMovie(movieMapper.toDto(orderTicket.getMovie()));

			orderTicketDtoList.add(orderTicketDto);
		});

		return orderTicketDtoList;
	}

}
