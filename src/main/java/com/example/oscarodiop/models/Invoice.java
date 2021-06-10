package com.example.oscarodiop.models;

import javax.persistence.*;

@Entity
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "invoice_id_seq")
    @SequenceGenerator(name="invoice_id_seq",allocationSize = 1)
    private Long id;

    private String file;

    @OneToOne
    private Customer customer;


}
