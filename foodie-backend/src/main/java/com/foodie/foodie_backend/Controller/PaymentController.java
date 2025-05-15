package com.foodie.foodie_backend.Controller;

import com.foodie.foodie_backend.Entity.Payment;
import com.foodie.foodie_backend.Service.PaymentService;
import com.foodie.foodie_backend.Payload.PaymentRequest; // Make sure this is correctly imported

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    // POST - Process Payment
    @PostMapping
    public ResponseEntity<?> makePayment(@RequestBody PaymentRequest request) {
        if (request.getTotalAmount() == null || request.getPaymentMethod() == null) {
            return ResponseEntity.badRequest().body(Map.of("message", "Payment method and amount are required."));
        }

        Payment payment = new Payment();
        payment.setPaymentMethod(request.getPaymentMethod());
        payment.setAmount(request.getTotalAmount());
        payment.setTransactionId(request.getUpiId()); // Optional field
        payment.setPaymentStatus("SUCCESS");

        paymentService.savePayment(payment); // ✅ Use the service layer

        return ResponseEntity.ok(Map.of("message", "Order placed successfully. You can pay on delivery"));
    }

    // GET - Get All Payments
    @GetMapping
    public ResponseEntity<List<Payment>> getAllPayments() {
        List<Payment> payments = paymentService.getAllPayments();
        return ResponseEntity.ok(payments);
    }

    // DELETE - Delete Payment by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePayment(@PathVariable Long id) {
        boolean deleted = paymentService.deletePayment(id);
        if (deleted) {
            return ResponseEntity.ok("🗑️ Payment deleted successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
