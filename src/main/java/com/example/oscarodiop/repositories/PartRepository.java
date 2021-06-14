package com.example.oscarodiop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.oscarodiop.models.Part;
import org.springframework.stereotype.Repository;

@Repository
public interface PartRepository extends JpaRepository<Part, Long> {
}
