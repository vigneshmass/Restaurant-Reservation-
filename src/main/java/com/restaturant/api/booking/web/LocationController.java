package com.restaturant.api.booking.web;

import com.restaturant.api.booking.model.Location;
import com.restaturant.api.booking.model.Rest;
import com.restaturant.api.booking.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class LocationController {
    @Autowired
    private LocationService locationService;
    @RequestMapping(value="/location",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Location> getLocation() {
        return (List<Location>) locationService.getAlllocation();

    }
    @RequestMapping(value="/location/(id)",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Location getLocationById(@PathVariable Long id) {
        return locationService.getAlllocationById(id);

    }


    @RequestMapping(value="/location",method= RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Location> createlocation(@RequestBody Location location){
        Location createLocation = locationService.createlocation (location);
        return Optional.ofNullable(createLocation)
                .map(c ->ResponseEntity.ok().body(c))
                .orElse(ResponseEntity.notFound(). build());
    }
    @CrossOrigin
    @RequestMapping(value="/location",method= RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Location> Createlocation(@RequestBody Location location){
        Location createLocation = locationService.createlocation (location);
        return Optional.ofNullable(createLocation)
                .map(c ->ResponseEntity.ok().body(c))
                .orElse(ResponseEntity.notFound(). build());
    }/*
    @RequestMapping(value = "/location/{id}",method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void deleteById(@PathVariable String id)
    {
        locationService.deleteById(id);
    }*/


    @RequestMapping(value="/locations/{id}/restaurants",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Rest> getRestaurantsByLocationId(@PathVariable Long id) {
        Location location =locationService.getLocationById(id);
        return location.getRest();
    }


}
