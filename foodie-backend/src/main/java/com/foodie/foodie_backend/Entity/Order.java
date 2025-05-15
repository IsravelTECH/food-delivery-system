package com.foodie.foodie_backend.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Many-to-One relationship with User
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;  // Assuming you have a 'User' entity that you are linking to

    private String name;
    private String email;
    private String phone;
    private String address;

    // Cart information stored as JSON string
    @Lob
    private String cartJson;

    // Constructors
    public Order() {
    }

    public Order(String name, String email, String phone, String address, String cartJson) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.cartJson = cartJson;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCartJson() {
        return cartJson;
    }

    public void setCartJson(String cartJson) {
        this.cartJson = cartJson;
    }
}
