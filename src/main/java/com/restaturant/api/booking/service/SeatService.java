package com.restaturant.api.booking.service;

import com.restaturant.api.booking.model.Seat;
import com.restaturant.api.booking.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatService {
    @Autowired
    private SeatRepository seatRepository;

    public List<Seat> getAllseat() {
        return (List<Seat>)  seatRepository.findAll();
    }

    public Seat getAllseatById(String id) {
        return seatRepository.findById(id).get();
    }

    public Seat createSeat(Seat seat) {
        return seatRepository.save(seat);
    }

    public void deleteById(String id) {
        seatRepository.deleteById(id);
    }
}
