package com.example.oscarodiop.models;

import javax.persistence.*;

@Entity
public class PartGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "partGroup_id_seq")
    @SequenceGenerator(name = "partGroup_id_seq", allocationSize = 1)
    private Long id;

    private String name;

    public PartGroup() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
