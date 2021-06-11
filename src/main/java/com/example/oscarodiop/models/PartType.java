package com.example.oscarodiop.models;

import javax.persistence.*;

@Entity
public class PartType {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "partType_id_seq")
    @SequenceGenerator(name = "partType_id_seq", allocationSize = 1)
    private Long id;

    String name;

    @ManyToOne
    private PartGroup partGroup;

    public PartType() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public PartGroup getPartGroup() {
        return partGroup;
    }
}//end
