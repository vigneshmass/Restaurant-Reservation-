package com.restaturant.api.booking.repository;

import com.restaturant.api.booking.model.MenuItem;
import org.springframework.data.repository.CrudRepository;

public interface MenuItemRepository extends CrudRepository<MenuItem,Long> {

}
