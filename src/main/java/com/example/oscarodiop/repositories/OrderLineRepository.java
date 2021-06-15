package com.example.oscarodiop.repositories;

import com.example.oscarodiop.models.OrderLine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderLineRepository extends JpaRepository<OrderLine, Long> {

    @Modifying
    void deleteAllByOrder_Id(Long id);

    List<OrderLine> findAllByOrder_Id(Long id);
}
