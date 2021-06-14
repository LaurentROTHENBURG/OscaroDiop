package com.example.oscarodiop.controllers;

import com.example.oscarodiop.models.PartGroup;
import com.example.oscarodiop.repositories.PartGroupRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("admin/partgroup")
public class PartGroupController {

    private PartGroupRepository partGroupRepository;

    public PartGroupController(PartGroupRepository partGroupRepository) {
        this.partGroupRepository = partGroupRepository;
    }

    @GetMapping
    public List<PartGroup> getAllPartGroup(){
        return partGroupRepository.findAll();
    }
}
