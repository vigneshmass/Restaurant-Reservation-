/*package com.restaturant.api.booking.service;

import com.restaturant.api.booking.model.Order;
import com.restaturant.api.booking.repository.OredrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OredrRepository oredrRepository;

    public List<Order> getAllorder() {

        return (List<Order>)  oredrRepository.findAll();
    }

    public Order createOrder(Order order) {
        return oredrRepository.save(order);
    }
}
*/