package com.foodie.foodie_backend.Controller;

import com.foodie.foodie_backend.Entity.CartItem;
import com.foodie.foodie_backend.Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cart")
@CrossOrigin(origins = "*")
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping("/add")
    public ResponseEntity<CartItem> addToCart(@RequestBody CartItem item) {
        return ResponseEntity.ok(cartService.addItemToCart(item));
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<CartItem>> getUserCart(@PathVariable Long userId) {
        return ResponseEntity.ok(cartService.getUserCart(userId));
    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity<String> removeItem(@PathVariable Long id) {
        return cartService.removeCartItem(id)
                ? ResponseEntity.ok("Item removed from cart.")
                : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/clear/{userId}")
    public ResponseEntity<String> clearCart(@PathVariable Long userId) {
        cartService.clearCart(userId);
        return ResponseEntity.ok("Cart cleared.");
    }
}
