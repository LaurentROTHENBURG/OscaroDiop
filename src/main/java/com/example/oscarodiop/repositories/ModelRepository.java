package com.example.oscarodiop.repositories;

import com.example.oscarodiop.models.Brand;
import com.example.oscarodiop.models.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

public interface ModelRepository extends JpaRepository<Model, Long> {

    @Modifying
    @Query ("update Model m set m.disable = true where m.id =:id ")
    int disableModel(@Param("id") Long id);

    List<Model> findModelByBrandIdOrderByNameAsc(@PathVariable ("brandId") Long brandId);


}
