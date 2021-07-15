package com.example.oscarodiop.controllers;

import com.example.oscarodiop.models.Model;
import com.example.oscarodiop.models.PartType;
import com.example.oscarodiop.repositories.ModelRepository;
import com.example.oscarodiop.repositories.PartTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("admin/models")

public class ModelController {
    @Autowired
    private ModelRepository modelRepository;

    public ModelController(ModelRepository modelRepository) {
        this.modelRepository = modelRepository;
    }

    @GetMapping
    public List<Model> getModelAll(){
        return modelRepository.findAll();
    }

    @GetMapping("/{brandId}")
    public List<Model> getModelByBrandId(@PathVariable Long brandId) {
         List<Model> model = modelRepository.findModelByBrandId(brandId);
        return  model;

   /*     if (model.isPresent()) {
            return model.get();
        } else {
            return null;*/

    }

    @PostMapping
    public Long createModel(@RequestBody Model modelToCreate) {
        return modelRepository.save(modelToCreate).getId();
    }

    @Transactional
    @PutMapping(value = "/disable/{id}")
    public ResponseEntity disableModel(@PathVariable("id") Long id){
        return new ResponseEntity((modelRepository.disableModel(id)) !=0 ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }


}//end
