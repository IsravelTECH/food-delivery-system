package com.foodie.foodie_backend.Payload;

public class PaymentRequest {

    private String phone;
    private String paymentMethod;
    private String upiId;        // Optional, only required for non-COD
    private Double totalAmount;

    // Constructors
    public PaymentRequest() {}

    public PaymentRequest(String phone, String paymentMethod, String upiId, Double totalAmount) {
        this.phone = phone;
        this.paymentMethod = paymentMethod;
        this.upiId = upiId;
        this.totalAmount = totalAmount;
    }

    // Getters and Setters
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getUpiId() {
        return upiId;
    }

    public void setUpiId(String upiId) {
        this.upiId = upiId;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
