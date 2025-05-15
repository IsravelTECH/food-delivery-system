package com.foodie.foodie_backend.Controller;

import com.foodie.foodie_backend.Entity.Order;
import com.foodie.foodie_backend.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    // ✅ Place an order (POST)
    @PostMapping
    public ResponseEntity<String> placeOrder(@RequestBody Order order) {
        try {
            orderService.placeOrder(order);
            return new ResponseEntity<>("Order placed successfully!", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Error placing the order: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    // ✅ Get all orders (GET)
    @GetMapping
    public ResponseEntity<List<Order>> getAllOrders() {
        return ResponseEntity.ok(orderService.getAllOrders());
    }

    // ✅ Get orders by user ID (GET)
    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Order>> getOrdersByUserId(@PathVariable Long userId) {
        return ResponseEntity.ok(orderService.getOrdersByUserId(userId));
    }

    // ✅ Delete order by ID (DELETE)
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteOrder(@PathVariable Long id) {
        boolean deleted = orderService.deleteOrder(id);
        if (deleted) {
            return ResponseEntity.ok("Order deleted successfully");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Order not found");
        }
    }
}
