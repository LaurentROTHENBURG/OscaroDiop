package com.example.oscarodiop.models;

import javax.persistence.*;

@Entity
public class OrderLine {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "brand_id_seq")
    @SequenceGenerator(name = "brand_id_seq", allocationSize = 1)

    private Long id;
    private int quantity;
    private double orderPrice;

    @ManyToOne
    private Order order;

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
}