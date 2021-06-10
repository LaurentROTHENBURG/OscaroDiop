package com.example.oscarodiop.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "order_id_seq")
    @SequenceGenerator(name="order_id_seq",allocationSize = 1)
    private Long id;
    private LocalDate orderDate;

    @ManyToOne
    private Customer customer;

    public Order(Long id, LocalDate orderDate, Customer customer) {
        this.id = id;
        this.orderDate = orderDate;
        this.customer = customer;
    }
    public Order() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
