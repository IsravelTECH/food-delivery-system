package com.foodie.foodie_backend.Service;

import com.foodie.foodie_backend.Entity.BookingTable;
import com.foodie.foodie_backend.Repository.BookingTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingTableService {

    @Autowired
    private BookingTableRepository bookingTableRepository;

    public BookingTable bookTable(BookingTable booking) {
        return bookingTableRepository.save(booking);
    }

    public List<BookingTable> getAllBookings() {
        return bookingTableRepository.findAll();
    }

    public boolean deleteBooking(Long id) {
        Optional<BookingTable> booking = bookingTableRepository.findById(id);
        if (booking.isPresent()) {
            bookingTableRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
