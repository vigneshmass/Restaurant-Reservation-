package com.restaturant.api.booking.web;

import com.restaturant.api.booking.model.Rest;
import com.restaturant.api.booking.service.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {
    @Autowired
    private RestService restService;
    @CrossOrigin
    @RequestMapping(value="/rest",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Rest> getRest() {
        return (List<Rest>) restService.getAllrest();

    }
    @CrossOrigin
    @RequestMapping(value="/rest/{id}",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Rest getRestById(@PathVariable Long id) {
        return  restService.getAllrestById(id);

    }

    @RequestMapping(value="/rest",method= RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Rest> createRest(@RequestBody Rest rest ){
        Rest createRest = restService.createRest (rest);
        return Optional.ofNullable(createRest)
                .map(c ->ResponseEntity.ok().body(c))
                .orElse(ResponseEntity.notFound(). build());
    }
    @RequestMapping(value="/rest",method= RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Rest> CreateRest(@RequestBody Rest rest ){
        Rest createRest = restService.createRest (rest);
        return Optional.ofNullable(createRest)
                .map(c ->ResponseEntity.ok().body(c))
                .orElse(ResponseEntity.notFound(). build());
    }
    @RequestMapping(value = "/rest/{id}",method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void deleteById(@PathVariable Long id)
    {
        restService.deleteById(id);
    }

}
