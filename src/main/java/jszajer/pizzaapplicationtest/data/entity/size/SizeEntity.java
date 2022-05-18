package jszajer.pizzaapplicationtest.data.entity.size;

import jszajer.pizzaapplicationtest.data.entity.ordersize.OrderSizeEntity;
import jszajer.pizzaapplicationtest.data.entity.pizza.PizzaEntity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "sizes")
public class SizeEntity {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;


    @Column(name = "size_type")
    private String sizeType;


    @Column(name = "price_base")
    private BigDecimal priceBase;


    @Column(name = "pizza_id")
    private Integer pizzaId;


    @OneToMany(mappedBy = "size")
    private Set<OrderSizeEntity> orderSizes;

    @ManyToOne()
    @JoinColumn(name = "pizza_id", insertable = false, updatable = false)
    private PizzaEntity pizza;







    public SizeEntity(Integer id, String sizeType, BigDecimal priceBase, Integer pizzaId, Set<OrderSizeEntity> orderSizes, PizzaEntity pizza) {
        this.id = id;
        this.sizeType = sizeType;
        this.priceBase = priceBase;
        this.pizzaId = pizzaId;
        this.orderSizes = orderSizes;
        this.pizza = pizza;
    }

    public SizeEntity() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSizeType() {
        return sizeType;
    }

    public void setSizeType(String sizeType) {
        this.sizeType = sizeType;
    }

    public BigDecimal getPriceBase() {
        return priceBase;
    }

    public void setPriceBase(BigDecimal priceBase) {
        this.priceBase = priceBase;
    }

    public Integer getPizzaId() {
        return pizzaId;
    }

    public void setPizzaId(Integer pizzaId) {
        this.pizzaId = pizzaId;
    }

    public Set<OrderSizeEntity> getOrderSizes() {
        return orderSizes;
    }

    public void setOrderSizes(Set<OrderSizeEntity> orderSizes) {
        this.orderSizes = orderSizes;
    }

    public PizzaEntity getPizza() {
        return pizza;
    }

    public void setPizza(PizzaEntity pizza) {
        this.pizza = pizza;
    }
}
