package com.example.oscarodiop.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "order_id_seq")
    @SequenceGenerator(name="order_id_seq",allocationSize = 1)
    private Long id;
    private LocalDate orderDate;

    //@JsonIgnore
    @ManyToOne
    private Customer customer;

    @OneToMany(mappedBy = "order")
    private List<OrderLine> orderLineList;

    public Order() {}

    public Long getId() {
        return id;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public Customer getCustomer() {
        return customer;
    }

}
