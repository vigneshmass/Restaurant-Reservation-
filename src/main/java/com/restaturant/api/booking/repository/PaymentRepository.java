package com.restaturant.api.booking.repository;

import com.restaturant.api.booking.model.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment,Long> {
}
