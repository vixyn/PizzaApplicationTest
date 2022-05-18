package jszajer.pizzaapplicationtest.data.entity.ordersize;

import jszajer.pizzaapplicationtest.data.entity.order.OrderEntity;
import jszajer.pizzaapplicationtest.data.entity.size.SizeEntity;

import javax.persistence.*;

@Entity
@Table(name = "orders_sizes")
public class OrderSizeEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "size_id")
    private Integer sizeId;

    @Column(name = "size_count")
    private Integer sizeCount;


    @ManyToOne
    @JoinColumn(name = "order_id", insertable = false, updatable = false)
    private OrderEntity order;

    @ManyToOne
    @JoinColumn(name = "size_id", insertable = false, updatable = false)
    private SizeEntity size;





    public OrderSizeEntity() {
    }

    public OrderSizeEntity(Integer id, Integer orderId, Integer sizeId, Integer sizeCount, OrderEntity order, SizeEntity size) {
        this.id = id;
        this.orderId = orderId;
        this.sizeId = sizeId;
        this.sizeCount = sizeCount;
        this.order = order;
        this.size = size;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getSizeId() {
        return sizeId;
    }

    public void setSizeId(Integer sizeId) {
        this.sizeId = sizeId;
    }

    public Integer getSizeCount() {
        return sizeCount;
    }

    public void setSizeCount(Integer sizeCount) {
        this.sizeCount = sizeCount;
    }

    public OrderEntity getOrder() {
        return order;
    }

    public void setOrder(OrderEntity order) {
        this.order = order;
    }

    public SizeEntity getSize() {
        return size;
    }

    public void setSize(SizeEntity size) {
        this.size = size;
    }
}