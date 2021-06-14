package com.example.oscarodiop.repository;

import com.example.oscarodiop.models.PartType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartTypeRepository extends JpaRepository<PartType, Integer> {

}
