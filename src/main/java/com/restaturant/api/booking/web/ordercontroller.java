package com.restaturant.api.booking.web;

/*import com.restaturant.api.booking.model.Order;
import com.restaturant.api.booking.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")

public class ordercontroller {
    @Autowired
    private OrderService orderService;


    @CrossOrigin
    @RequestMapping(value="/order",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Order> getOredr() {
        return (List<Order>) orderService.getAllorder();
    }
    @CrossOrigin
    @RequestMapping(value="/order",method= RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Order> createOrder(@RequestBody Order order ){
        Order createOrder = orderService.createOrder (order);
        return Optional.ofNullable(createOrder)
                .map(c ->ResponseEntity.ok().body(c))
                .orElse(ResponseEntity.notFound(). build());
    }

}*/
