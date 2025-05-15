package com.foodie.foodie_backend.Controller;

import com.foodie.foodie_backend.Entity.Contact;
import com.foodie.foodie_backend.Service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    // POST
    @PostMapping
    public ResponseEntity<String> submitContact(@RequestBody Contact contact) {
        contactService.submitContact(contact);
        return ResponseEntity.ok("Contact form submitted successfully!");
    }

    // GET
    @GetMapping
    public ResponseEntity<List<Contact>> getAllContacts() {
        return ResponseEntity.ok(contactService.getAllContacts());
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteContact(@PathVariable Long id) {
        boolean deleted = contactService.deleteContact(id);
        if (deleted) {
            return ResponseEntity.ok("Contact deleted successfully.");
        } else {
            return ResponseEntity.status(404).body("Contact not found.");
        }
    }
}
