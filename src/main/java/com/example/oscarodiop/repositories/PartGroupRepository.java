package com.example.oscarodiop.repositories;

import com.example.oscarodiop.models.PartGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartGroupRepository extends JpaRepository<PartGroup,Integer> {

}
