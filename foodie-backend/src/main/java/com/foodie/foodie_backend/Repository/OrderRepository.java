package com.foodie.foodie_backend.Repository;

import com.foodie.foodie_backend.Entity.User;
import com.foodie.foodie_backend.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUser(User user);
    List<Order> findByUserId(Long userId);
}
