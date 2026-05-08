package com.project.food_order_backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.food_order_backend.model.CartItem;

public interface Cart_Repo extends JpaRepository<CartItem, Long> {

}
