package com.restaturant.api.booking.repository;

import com.restaturant.api.booking.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OredrRepository  extends CrudRepository<Order,Long> {
}
