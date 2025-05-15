package com.foodie.foodie_backend.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String paymentMethod; // GPay, PhonePe, COD

    @Column(nullable = false)
    private Double amount;

    @Column
    private String transactionId; // Optional

    @Column
    private String paymentStatus; // Optional: SUCCESS, PENDING, etc.

    // Constructors
    public Payment() {
    }

    public Payment(String paymentMethod, Double amount) {
        this.paymentMethod = paymentMethod;
        this.amount = amount;
    }

    public Payment(String paymentMethod, Double amount, String transactionId, String paymentStatus) {
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.transactionId = transactionId;
        this.paymentStatus = paymentStatus;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", amount=" + amount +
                ", transactionId='" + transactionId + '\'' +
                ", paymentStatus='" + paymentStatus + '\'' +
                '}';
    }
}
