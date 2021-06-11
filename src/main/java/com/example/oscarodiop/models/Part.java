package com.example.oscarodiop.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Part {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "part_id_seq")
    @SequenceGenerator(name = "part_id_seq", allocationSize = 1)
    private Long id;

    @ManyToOne
    private PartType partType;

    @OneToOne
    private Model model;

    @OneToMany(mappedBy = "part")
    private List<OrderLine> orderLineList;

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
