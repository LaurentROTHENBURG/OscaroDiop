package com.example.oscarodiop.controllers;

import com.example.oscarodiop.models.Part;
import com.example.oscarodiop.repositories.PartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("admin/parts")
public class PartController {
    @Autowired
    private PartRepository partRepository;


    @GetMapping
    public List<Part> getAllParts(){
        return partRepository.findAll(); }


}
