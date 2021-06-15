package com.example.oscarodiop.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class OrderLine {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "orderline_id_seq")
    @SequenceGenerator(name = "orderline_id_seq", allocationSize = 1)

    private Long id;
    private int quantity;
    private double orderPrice;

    //@JsonIgnore
    @ManyToOne
    private Order order;

    @ManyToOne
    private Part part;

    public OrderLine() {
    }

    public Long getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public Order getOrder() {
        return order;
    }

    public Part getPart() {
        return part;
    }
}
