package com.erp.vendor.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "vendors")
public class vendor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String contact;
    private Double rating;

    // getters setters
    public Long getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getContact() { return contact; }
    public void setContact(String contact) { this.contact = contact; }

    public Double getRating() { return rating; }
    public void setRating(Double rating) { this.rating = rating; }
}