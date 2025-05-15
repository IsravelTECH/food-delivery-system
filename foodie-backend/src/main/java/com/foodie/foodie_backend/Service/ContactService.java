package com.foodie.foodie_backend.Service;

import com.foodie.foodie_backend.Entity.Contact;
import com.foodie.foodie_backend.Repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    // Submit the contact form data to the database
    public void submitContact(Contact contact) {
        contactRepository.save(contact);
    }

    // Get all contact forms from the database
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    // Delete a contact form by ID
    public boolean deleteContact(Long id) {
        if (contactRepository.existsById(id)) {
            contactRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
