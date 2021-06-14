package com.example.oscarodiop.repositories;

import com.example.oscarodiop.models.PartGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PartGroupRepository extends JpaRepository<PartGroup,Integer> {
    @Modifying //par defaut n est en lecture seule donc on le force a etre modifiable
    @Query( "update PartGroup m set m.name= :value where  m.id= :id")
    int setValueById(@Param("value") String value, @Param("id") Long id);
}
