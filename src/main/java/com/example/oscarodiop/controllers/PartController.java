package com.example.oscarodiop.controllers;

import com.example.oscarodiop.models.Part;
import com.example.oscarodiop.repositories.PartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("admin/parts")
public class PartController {
    @Autowired
    private PartRepository partRepository;


    @GetMapping
    public List<Part> getAllParts(){
        return partRepository.findAll();
    }

    @GetMapping(value = "/getPartsByBrand")
    public List<Part> getPartsByBrand(@RequestParam("idBrand") Long idBrand){
        return partRepository.findAllByModel_Id(idBrand);
    }

    @GetMapping(value = "/{id}")
    public Part getPart(@PathVariable ("id") Long id){
        return partRepository.getById(id);
    }

    @PostMapping
    public Long savePart(@RequestBody Part part){
        return partRepository.save(part).getId();
    }

    @Transactional
    @PutMapping(value = "/update/{id}")
    public Part updatePart(@RequestBody Part part, @PathVariable("id") Long id){
        return partRepository.save(part);
    }

    @Transactional
    @PutMapping(value = "/disable/{id}")
    public ResponseEntity disablePart(@PathVariable("id") Long id){
        return new ResponseEntity((partRepository.disablePart(id)) !=0 ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

    @Transactional
    @DeleteMapping(value = "/delete/{id}")
    public void deletePart(@PathVariable Long id){
        partRepository.deleteById(id);

    }

}
