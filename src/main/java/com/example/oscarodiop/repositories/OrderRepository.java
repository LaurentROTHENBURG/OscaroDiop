package com.example.oscarodiop.repositories;

import com.example.oscarodiop.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
@Modifying
 void deleteOrderById(Long id);


    @Modifying
    List<Order> getOrdersByCustomer_Id(Long id);
}
