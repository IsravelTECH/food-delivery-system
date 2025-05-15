package com.foodie.foodie_backend.Service;

import com.foodie.foodie_backend.Entity.CartItem;
import com.foodie.foodie_backend.Repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    public CartItem addItemToCart(CartItem item) {
        return cartRepository.save(item);
    }

    public List<CartItem> getUserCart(Long userId) {
        return cartRepository.findByUserId(userId);
    }

    public boolean removeCartItem(Long id) {
        if (cartRepository.existsById(id)) {
            cartRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public void clearCart(Long userId) {
        cartRepository.deleteByUserId(userId);
    }
}
