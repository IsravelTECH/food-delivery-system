package com.foodie.foodie_backend.Repository;

import com.foodie.foodie_backend.Entity.BookingTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingTableRepository extends JpaRepository<BookingTable, Long> {
}
