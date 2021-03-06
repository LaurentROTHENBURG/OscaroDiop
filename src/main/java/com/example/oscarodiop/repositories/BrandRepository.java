package com.example.oscarodiop.repositories;

import com.example.oscarodiop.models.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {


    @Modifying
    @Query("update Brand b set b.disable = true where b.id =:id ")

    int disableBrand(@Param("id") Long id);

    List<Brand> findAllByOrderByNameAsc();

    int countBrandsBy();

}//end
