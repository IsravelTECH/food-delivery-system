package com.foodie.foodie_backend.Repository;

import com.foodie.foodie_backend.Entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
    // We can add custom queries here if needed
}
