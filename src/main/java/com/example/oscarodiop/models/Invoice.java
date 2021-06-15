package com.example.oscarodiop.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "invoice_id_seq")
    @SequenceGenerator(name="invoice_id_seq",allocationSize = 1)
    private Long id;

    private String file;

    private LocalDate editionDate;

    @OneToOne
    private Customer customer;

    public Invoice() {
    }

    public Long getId() {
        return id;
    }

    public String getFile() {
        return file;
    }

    public LocalDate getEditionDate() {
        return editionDate;
    }

    public Customer getCustomer() {
        return customer;
    }
}
