package com.project.food_order_backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.food_order_backend.model.Restaurant;
import com.project.food_order_backend.repo.Restaurant_Repo;

@Service
public class Restaurant_Service {

    @Autowired
    private Restaurant_Repo restaurantRepo;

    public List<Restaurant> getAllRestaurants() {
        return restaurantRepo.findAll();
    }

    public Restaurant addRestaurant(Restaurant restaurant) {
        return restaurantRepo.save(restaurant);
    }
}
