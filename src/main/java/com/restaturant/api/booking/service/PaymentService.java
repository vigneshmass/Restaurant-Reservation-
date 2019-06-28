package com.restaturant.api.booking.service;

import com.restaturant.api.booking.model.Payment;
import com.restaturant.api.booking.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;
    public List<Payment> getAllPayment(){
        return (List<Payment>)paymentRepository.findAll();
    }


    public Payment createPayment(Payment payment) {
        return paymentRepository.save(payment);
    }
}
