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

    List<Part> findAllByModelIdAndPartTypeId(@Param("id") Long idBrand, @Param("idPartType") Long idPartType);

    //List<Part> findAllByModelAndPartType(@Param("id") Long idBrand, @Param("idPartType") Long idPartType);


    @Query(value = "select p.*, pg.name, pt.name, m.name, b.name from part p\n" +
            "inner join model m on m.id = p.model_id\n" +
            "inner join brand b on b.id = m.brand_id\n" +
            "inner join part_type pt on pt.id = p.part_type_id\n" +
            "inner join part_group pg on pg.id = pt.part_group_id\n" +
            "where p.disable = false AND p.model_id = :id AND \n" +
            "p.part_type_id = :idPartType AND pg.id = :idPartGroup", nativeQuery = true)
    List<Part> findAllByModel_IdAndPartTypeAndPartGroup(@Param("id") Long idBrand, @Param("idPartType") Long idPartType, @Param("idPartGroup") Long idPartGroup);
}
