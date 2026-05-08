package com.project.food_order_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.food_order_backend.model.CartItem;
import com.project.food_order_backend.service.Cart_Service;

@RestController
@RequestMapping("/cart")
@CrossOrigin("*")
public class Cart_Controller {

    @Autowired
    private Cart_Service cartService;

    @PostMapping
    public CartItem addToCart(@RequestBody CartItem item) {
        return cartService.addToCart(item);
    }

    @GetMapping
    public List<CartItem> getCartItems() {
        return cartService.getCartItems();
    }

    @DeleteMapping("/{id}")
    public void removeCartItem(@PathVariable Long id) {
        cartService.removeCartItem(id);
    }
}
