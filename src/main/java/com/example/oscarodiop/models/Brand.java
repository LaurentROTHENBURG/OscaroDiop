package com.example.oscarodiop.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


@Entity
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "brand_id_seq")
    @SequenceGenerator(name = "brand_id_seq", allocationSize = 1)

    private Long id;
    @Column(length = 255)
    private String name;
    private LocalDate addDate;
    private boolean disable;

    @OneToMany(mappedBy = "model")
    private List<Model> model;

    public Brand() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getAddDate() {
        return addDate;
    }

    public boolean isDisable() {
        return disable;
    }

    public List<Model> getModel() {
        return model;
    }
}
