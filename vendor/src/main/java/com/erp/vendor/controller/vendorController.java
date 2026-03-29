package com.erp.vendor.controller;

import com.erp.vendor.entity.vendor;
import com.erp.vendor.repository.vendorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendors")
@CrossOrigin
public class vendorController {

    private final vendorRepository vendorRepository;

    public vendorController(vendorRepository vendorRepository) {
        this.vendorRepository = vendorRepository;
    }

    @PostMapping
    public vendor addVendor(@RequestBody vendor vendor) {
        return vendorRepository.save(vendor);
    }

    @GetMapping
    public List<vendor> getAllVendors() {
        return vendorRepository.findAll();
    }
}