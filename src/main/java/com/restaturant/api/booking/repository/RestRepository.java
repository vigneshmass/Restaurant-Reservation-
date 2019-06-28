package com.restaturant.api.booking.repository;

import com.restaturant.api.booking.model.Rest;
import org.springframework.data.repository.CrudRepository;

public interface RestRepository extends CrudRepository<Rest,Long> {
}
