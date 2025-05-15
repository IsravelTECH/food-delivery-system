package com.foodie.foodie_backend.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.*;

@Entity
public class BookingTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String phone;
    private String email;
    private String reservationDate;
    private int numberOfPeople;
    private String tableNumber; // Add this line

    // Default constructor
    public BookingTable() {}

    // Constructor
    public BookingTable(String name, String phone, String email, String reservationDate, int numberOfPeople) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.reservationDate = reservationDate;
        this.numberOfPeople = numberOfPeople;
        this.tableNumber = tableNumber;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(String reservationDate) {
        this.reservationDate = reservationDate;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(String tableNumber) {
        this.tableNumber = tableNumber;
    }

    // toString method
    @Override
    public String toString() {
        return "BookingTable{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", reservationDate='" + reservationDate + '\'' +
                ", numberOfPeople=" + numberOfPeople +
                ", tableNumber='" + tableNumber + '\'' +
                '}';
    }

    // equals and hashCode methods (optional but recommended)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookingTable that = (BookingTable) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
