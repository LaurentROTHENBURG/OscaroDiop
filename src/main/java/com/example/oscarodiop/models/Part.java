package com.example.oscarodiop.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Part {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "part_id_seq")
    @SequenceGenerator(name = "part_id_seq", allocationSize = 1)
    private Long id;

    @ManyToOne
    private PartType parttype;

    @ManyToOne
    private Model model;

    private String reference;
    private Long serialNumber;
    private String description;
    private LocalDate addDate;
    private Long stock;
    private Double publicPrice;
    private Double minimumPrice;

    public Part() {
    }
}//end
