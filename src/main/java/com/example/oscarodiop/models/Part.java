package com.example.oscarodiop.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Part {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "part_id_seq")
    @SequenceGenerator(name = "part_id_seq", allocationSize = 1)
    private Long id;

    @JsonIgnore
    @ManyToOne
    private PartType partType;

    @JsonIgnore
    @OneToOne
    private Model model;

    @JsonIgnore
    @OneToMany(mappedBy = "part")
    private List<OrderLine> orderLineList;

    private String reference;
    private String serialNumber;
    private String description;
    private LocalDate addDate;
    private int stock;
    private Double publicPrice;
    private Double minimumPrice;

    public Part() {
    }

    public Long getId() {
        return id;
    }

    public PartType getPartType() {
        return partType;
    }

    public Model getModel() {
        return model;
    }

    public List<OrderLine> getOrderLineList() {
        return orderLineList;
    }

    public String getReference() {
        return reference;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getAddDate() {
        return addDate;
    }

    public int getStock() {
        return stock;
    }

    public Double getPublicPrice() {
        return publicPrice;
    }

    public Double getMinimumPrice() {
        return minimumPrice;
    }
}//end
