package com.erp.vendor.repository;

import com.erp.vendor.entity.vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface vendorRepository extends JpaRepository<vendor, Long> {
}