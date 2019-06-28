package com.restaturant.api.booking.web;


import com.restaturant.api.booking.model.Payment;
import com.restaturant.api.booking.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @RequestMapping(value = "/payments", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Payment> getPayment() {
        return (List<Payment>) paymentService.getAllPayment();

    }
    @CrossOrigin

    @RequestMapping(value = "/payments", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Payment> createPayment(@RequestBody Payment payment) {
        Payment createdPayment = paymentService.createPayment(payment);
        return Optional.ofNullable(createdPayment)
                .map(b -> ResponseEntity.ok().body(b))
                .orElse(ResponseEntity.notFound().build());
    }

    @RequestMapping(value = "/payments", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Payment> CreatePayment(@RequestBody Payment payment) {
        Payment CreatedPayment = paymentService.createPayment(payment);
        return Optional.ofNullable(CreatedPayment)
                .map(b -> ResponseEntity.ok().body(b))
                .orElse(ResponseEntity.notFound().build());
    }
}
