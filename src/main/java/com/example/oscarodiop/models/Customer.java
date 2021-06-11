package com.example.oscarodiop.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_id_seq")
    @SequenceGenerator(name = "customer_id_seq", allocationSize = 1)
    private Long id;

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String mail;
    private String userName;
    private String password;

    @OneToMany(mappedBy = "customer")
    private List<Order> orderList;

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }


    public String getMail() {
        return mail;
    }

    public String getUserName() {
        return userName;
    }


    public String getPassword() {
        return password;
    }


}
