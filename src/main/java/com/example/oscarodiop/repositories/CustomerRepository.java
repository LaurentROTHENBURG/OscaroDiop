package com.example.oscarodiop.repositories;

import com.example.oscarodiop.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Modifying
    @Query("update Customer c set c.firstName =: firstName," +
            "c.lastName =: lastname," +
            "c.mail =: mail," +
            "c.phoneNumber =: phoneNumber," +
            "c.userName =: userName ")

    int updateCustomer(@Param("firstName") String firstName,
                     @Param("lastName") String lastName,
                     @Param("mail") String mail,
                     @Param("phoneNumber") String phoneNumber,
                     @Param("userName") String userName
    );
}
