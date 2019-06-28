package com.restaturant.api.booking.web;

import com.restaturant.api.booking.model.Seat;
import com.restaturant.api.booking.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SeatController {
    @Autowired
    private SeatService seatService;


     @CrossOrigin
    @RequestMapping(value="/seat",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Seat> getSeat() {
        return (List<Seat>) seatService.getAllseat();

    }
    @RequestMapping(value="/seat/(id)",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Seat getSeatById(@PathVariable String id) {
        return  seatService.getAllseatById(id);

    }
    @CrossOrigin
    @RequestMapping(value="/seat",method= RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Seat> createSeat(@RequestBody Seat seat ){
        Seat createSeat = seatService.createSeat (seat);
        return Optional.ofNullable(createSeat)
                .map(c ->ResponseEntity.ok().body(c))
                .orElse(ResponseEntity.notFound(). build());
    }
    @CrossOrigin
    @RequestMapping(value="/seat",method= RequestMethod.PUT,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Seat> CreateSeat(@RequestBody Seat seat ){
        Seat createSeat = seatService.createSeat (seat);
        return Optional.ofNullable(createSeat)
                .map(c ->ResponseEntity.ok().body(c))
                .orElse(ResponseEntity.notFound(). build());
    }
    @RequestMapping(value = "/seat/{id}",method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void deleteById(@PathVariable String id)
    {
        seatService.deleteById(id);
    }

}
