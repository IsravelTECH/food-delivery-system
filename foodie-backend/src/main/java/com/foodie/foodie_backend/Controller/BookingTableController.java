package com.foodie.foodie_backend.Controller;

import com.foodie.foodie_backend.Entity.BookingTable;
import com.foodie.foodie_backend.Service.BookingTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/book-table")
public class BookingTableController {

    @Autowired
    private BookingTableService bookingTableService;

    // POST - Book a table
    @PostMapping
    public ResponseEntity<String> bookTable(@RequestBody BookingTable booking) {
        bookingTableService.bookTable(booking);
        return ResponseEntity.ok("Table booked successfully!");
    }

    // GET - Get all table bookings
    @GetMapping
    public ResponseEntity<List<BookingTable>> getAllBookings() {
        List<BookingTable> bookings = bookingTableService.getAllBookings();
        return ResponseEntity.ok(bookings);
    }

    // DELETE - Delete a table booking by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBooking(@PathVariable Long id) {
        boolean deleted = bookingTableService.deleteBooking(id);
        if (deleted) {
            return ResponseEntity.ok("Table booking deleted successfully.");
        } else {
            return ResponseEntity.status(404).body("Booking not found.");
        }
    }
}
