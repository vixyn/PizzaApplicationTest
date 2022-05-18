package jszajer.pizzaapplicationtest.remote.rest.dto.request;

import java.util.List;

public class AddOrderDto {

    private Integer id;
    private List<PizzaOrderDto> pizzas;
    private PersonOrderDto personOrderDto;


    public AddOrderDto() {
    }

    public AddOrderDto(Integer id, List<PizzaOrderDto> pizzas, PersonOrderDto personOrderDto) {
        this.id = id;
        this.pizzas = pizzas;
        this.personOrderDto = personOrderDto;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<PizzaOrderDto> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<PizzaOrderDto> pizzas) {
        this.pizzas = pizzas;
    }

    public PersonOrderDto getPersonOrderDto() {
        return personOrderDto;
    }

    public void setPersonOrderDto(PersonOrderDto personOrderDto) {
        this.personOrderDto = personOrderDto;
    }
}
