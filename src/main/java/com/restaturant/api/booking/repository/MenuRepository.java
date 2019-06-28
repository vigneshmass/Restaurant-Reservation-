package com.restaturant.api.booking.repository;

import com.restaturant.api.booking.model.Menu;
import org.springframework.data.repository.CrudRepository;

public interface MenuRepository extends CrudRepository<Menu,Long> {
}
