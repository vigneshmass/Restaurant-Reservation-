package com.restaturant.api.booking.repository;

import com.restaturant.api.booking.model.Location;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends CrudRepository<Location,Long> {

}
