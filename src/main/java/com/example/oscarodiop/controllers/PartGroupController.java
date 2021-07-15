package com.example.oscarodiop.controllers;

import com.example.oscarodiop.models.PartGroup;
import com.example.oscarodiop.repositories.PartGroupRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("admin/partgroup")

@CrossOrigin("http://localhost:4200")

public class PartGroupController {

    private PartGroupRepository partGroupRepository;

    public PartGroupController(PartGroupRepository partGroupRepository) {
        this.partGroupRepository = partGroupRepository;
    }

    @GetMapping
    public List<PartGroup> getAllPartGroup() {
        return partGroupRepository.findAll();
    }


    @PostMapping
    public Long createPartGroupe(@RequestBody PartGroup partGroup) {
        return partGroupRepository.save(partGroup).getId();
    }

    @Transactional
    @DeleteMapping("/{id}")
    public void deletePartGroupe(@PathVariable Long id) {
        partGroupRepository.deleteById(id);
    }

    @Transactional //pour que la methode modifie la base
    @PutMapping("/{id}/value")
    public ResponseEntity updatePartGroup(@PathVariable Long id, @RequestBody String value) {
        return new ResponseEntity((partGroupRepository.setValueById(value, id) != 0)
                ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }


}
