package com.example.oscarodiop.controllers;

import com.example.oscarodiop.models.PartType;
import com.example.oscarodiop.repository.PartTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/admin/parttype")

public class PartTypeController {

    @Autowired
    private PartTypeRepository partTypeRepository;

    public PartTypeController(PartTypeRepository partTypeRepository) {
        this.partTypeRepository = partTypeRepository;
    }

    @GetMapping
    public List<PartType> getPartTypeAll() { return partTypeRepository.findAll();}

    public PartTypeRepository getPartTypeRepository() {
        return partTypeRepository;
    }
}
