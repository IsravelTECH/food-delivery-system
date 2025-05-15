package com.foodie.foodie_backend.Repository;

import com.foodie.foodie_backend.Entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    // You can add custom query methods here if needed
}
