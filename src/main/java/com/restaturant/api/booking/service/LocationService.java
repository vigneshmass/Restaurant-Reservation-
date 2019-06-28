package com.restaturant.api.booking.service;

import com.restaturant.api.booking.model.Location;
import com.restaturant.api.booking.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationService {
    @Autowired
    private LocationRepository locationRepository;

    public List<Location> getAlllocation() {
        return (List<Location>) locationRepository.findAll();

    }

    public Location getLocationById(Long id) {
      return Optional.ofNullable(locationRepository.findById(id))
              .map(Optional::get)
              .orElse(null);
    }

    public Location createlocation(Location location) {
        return  locationRepository.save(location);

    }


    public Location getAlllocationById(Long id) {
        return locationRepository.findById(id).get();
    }
}


