package jszajer.pizzaapplicationtest.data.entity.order;



import jszajer.pizzaapplicationtest.data.entity.ordersize.OrderSizeEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "client_name")
    private String clientName;

    @Column(name = "client_address")
    private String clientAddress;

    @Column(name = "client_phone")
    private String clientPhone;

    @Column(name = "floor")
    private Integer floor;

    @Column(name = "status")
    private String status;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at")
    private Date updatedAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "expected_at")
    private Date expectedAt;

    @Column(name = "token")
    private String token;

    @OneToMany(mappedBy = "order")
    private Set<OrderSizeEntity> orderSizes;



    public void setCreatedAt(Date date) {
        this.createdAt = date;
    }




    public OrderEntity() {
    }

    public OrderEntity(Integer id, String clientName, String clientAddress, String clientPhone, Integer floor, String status, Date createdAt, Date updatedAt, Date expectedAt, String token, Set<OrderSizeEntity> orderSizes) {
        this.id = id;
        this.clientName = clientName;
        this.clientAddress = clientAddress;
        this.clientPhone = clientPhone;
        this.floor = floor;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.expectedAt = expectedAt;
        this.token = token;
        this.orderSizes = orderSizes;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getExpectedAt() {
        return expectedAt;
    }

    public void setExpectedAt(Date expectedAt) {
        this.expectedAt = expectedAt;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Set<OrderSizeEntity> getOrderSizes() {
        return orderSizes;
    }

    public void setOrderSizes(Set<OrderSizeEntity> orderSizes) {
        this.orderSizes = orderSizes;
    }
}
