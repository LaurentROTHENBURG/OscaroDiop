package com.example.oscarodiop.repositories;

import com.example.oscarodiop.models.Invoice;
import com.example.oscarodiop.models.PartType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}
