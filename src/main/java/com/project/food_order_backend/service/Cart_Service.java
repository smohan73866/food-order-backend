package com.project.food_order_backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.food_order_backend.model.CartItem;
import com.project.food_order_backend.repo.Cart_Repo;

@Service
public class Cart_Service {

    @Autowired
    private Cart_Repo cartRepo;

    public CartItem addToCart(CartItem item) {
        return cartRepo.save(item);
    }

    public List<CartItem> getCartItems() {
        return cartRepo.findAll();
    }

    public void removeCartItem(Long id) {
        cartRepo.deleteById(id);
    }
}
