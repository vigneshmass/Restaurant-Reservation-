package com.restaturant.api.booking.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long locationId;
    private String locationRegion;
    private String locationArea;


    @OneToMany
    @JsonIgnore
    @JoinColumn(name = "locationId", referencedColumnName = "locationId")
    private List<Rest> rest = new ArrayList<>();

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public String getLocationRegion() {
        return locationRegion;
    }

    public void setLocationRegion(String locationRegion) {
        this.locationRegion = locationRegion;
    }

    public String getLocationArea() {
        return locationArea;
    }

    public void setLocationArea(String locationArea) {
        this.locationArea = locationArea;
    }

    public List<Rest> getRest() {
        return rest;
    }

    public void setRest(List<Rest> rest) {
        this.rest = rest;
    }
}
