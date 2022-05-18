package jszajer.pizzaapplicationtest.remote.rest.dto.response;

import jszajer.pizzaaplicationtest.domain.model.OrderStatusType;
import jszajer.pizzaaplicationtest.remote.rest.dto.request.PersonOrderDto;
import jszajer.pizzaaplicationtest.remote.rest.dto.request.PizzaOrderDto;

import java.util.List;

public class OrderDto {

    private Integer id;
    private OrderStatusType status;
    private List<PizzaOrderDto> pizzas;
    private PersonOrderDto person;

    public OrderDto() {
    }

    public OrderDto(Integer id, OrderStatusType status, List<PizzaOrderDto> pizzas, PersonOrderDto person) {
        this.id = id;
        this.status = status;
        this.pizzas = pizzas;
        this.person = person;
    }

}
