package com.example.oscarodiop.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class PartGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "partGroup_id_seq")
    @SequenceGenerator(name = "partGroup_id_seq", allocationSize = 1)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "partGroup")
    private List<PartType> partTypeList;

    public PartGroup() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
