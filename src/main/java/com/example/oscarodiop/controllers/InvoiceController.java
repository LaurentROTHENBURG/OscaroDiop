package com.example.oscarodiop.controllers;

import com.example.oscarodiop.models.Invoice;
import com.example.oscarodiop.repositories.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/admin/invoices")

public class InvoiceController {

    @Autowired
    private InvoiceRepository invoiceRepository;

    public InvoiceController(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    @GetMapping
    public List<Invoice> getInvoiceAll() {
        return invoiceRepository.findAll();
    }

    @GetMapping("/{id}")
    public Invoice getInvoiceById(@PathVariable Long id) {
        Optional<Invoice> invoice = invoiceRepository.findById(id);

        if (invoice.isPresent()) {
            return invoice.get();
        } else {
            return null;
        }
    }

    @PostMapping
    public Long createInvoice(@RequestBody Invoice invoiceToCreate) {
        return invoiceRepository.save(invoiceToCreate).getId();
    }

}//end

