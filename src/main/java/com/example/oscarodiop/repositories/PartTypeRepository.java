package com.example.oscarodiop.repositories;

import com.example.oscarodiop.models.PartType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PartTypeRepository extends JpaRepository<PartType, Long> {

    List<PartType> findByPartGroupId(Long groupId);

}
