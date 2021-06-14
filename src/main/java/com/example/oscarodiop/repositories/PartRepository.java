package com.example.oscarodiop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.oscarodiop.models.Part;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface PartRepository extends JpaRepository<Part, Long> {
    @Modifying
    @Query(value = "update Part p set p.disable = true where p.id = :id")
    int disablePart(@Param("id") Long id);

    List<Part> findAllByModel_Id(@Param("id") Long idBrand);
}
