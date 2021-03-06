package com.example.oscarodiop.controllers;

import com.example.oscarodiop.models.PartType;
import com.example.oscarodiop.repositories.PartTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("admin/parttype")
@CrossOrigin("http://localhost:4200")

public class PartTypeController {

    @Autowired
    private PartTypeRepository partTypeRepository;

    public PartTypeController(PartTypeRepository partTypeRepository) {
        this.partTypeRepository = partTypeRepository;
    }

    @GetMapping
    public List<PartType> getPartTypeAll() {
        return partTypeRepository.findAll();
    }

    @GetMapping("/{groupId}")
    public List<PartType> getPartTypeByGroupId(@PathVariable Long groupId) {
        List<PartType> partType = partTypeRepository.findByPartGroupId(groupId);

        return partType;
    }

    @PostMapping
    public Long createPartType(@RequestBody PartType partTypeToCreate) {
        return partTypeRepository.save(partTypeToCreate).getId();
    }

    @Transactional
    @DeleteMapping("/{id}")
    public void deletePartTypeById(@PathVariable Long id) {
        partTypeRepository.deleteById(id);
    }

}//end
