package com.example.oscarodiop.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;


import java.util.List;

@Entity
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "model_id_seq")
    @SequenceGenerator(name = "model_id_seq", allocationSize = 1)

    private Long id;
    String name;
    int year;
    LocalDate addDate;
    boolean disable;

   // @JsonIgnore
    @ManyToOne
    private Brand brand;

    public Long getId() {
        return  id;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public LocalDate getAddDate() {
        return addDate;
    }

    public boolean isDisable() {
        return disable;
    }

    public Model() {
    }

    public Brand getBrand() {
        return brand;
    }


}//end
