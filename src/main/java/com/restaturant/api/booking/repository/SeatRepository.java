package com.restaturant.api.booking.repository;

import com.restaturant.api.booking.model.Seat;
import org.springframework.data.repository.CrudRepository;

public interface SeatRepository  extends CrudRepository<Seat,String> {
}
