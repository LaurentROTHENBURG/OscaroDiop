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

    String reference;
    Long serialNumber;
    String description;
    LocalDate addDate;
    Long stock;
    Double publicPrice;
    Double minimumPrice;

}//end
