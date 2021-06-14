package com.example.oscarodiop.controllers;

import com.example.oscarodiop.models.Brand;
import com.example.oscarodiop.models.PartType;
import com.example.oscarodiop.repositories.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("admin/brand")

public class BrandController {

    @Autowired
    private BrandRepository brandRepository;

    public BrandController(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @GetMapping
    public List<Brand> getAllBrand() {
        return brandRepository.findAll();
    }

    @GetMapping("/{id}")
    public Brand getBrandById(@PathVariable Long id) {
        Optional<Brand> brand = brandRepository.findById(id);

        if (brand.isPresent()) {
            return brand.get();
        } else {
            return null;
        }
    }

    @PostMapping
    public Long createBrand(@RequestBody Brand brandToCreate) {
        return brandRepository.save(brandToCreate).getId();
    }

//    @Transactional
//    @PutMapping("/disable/{id}")
//    public void disableBrand(@PathVariable Long id) {
//        brandRepository.disableBrand(id);
//    }

    @Transactional
    @PutMapping(value = "/disable/{id}")
    public ResponseEntity disableBrand(@PathVariable("id") Long id){
        return new ResponseEntity((brandRepository.disableBrand(id)) !=0 ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

}//end
