package com.foodie.foodie_backend.Service;

import com.foodie.foodie_backend.Entity.Payment;
import com.foodie.foodie_backend.Repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    // Save payment
    public void savePayment(Payment payment) {
        paymentRepository.save(payment);
    }

    // Get all payments
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    // Delete payment by ID
    public boolean deletePayment(Long id) {
        Optional<Payment> payment = paymentRepository.findById(id);
        if (payment.isPresent()) {
            paymentRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
