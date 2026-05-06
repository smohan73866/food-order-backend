package com.project.food_order_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.food_order_backend.model.Restaurant;
import com.project.food_order_backend.service.Restaurant_Service;

@RestController
@RequestMapping("/restaurants")
@CrossOrigin("*")
public class Restaurant_Controller {

    @Autowired
    private Restaurant_Service restaurantService;

    @GetMapping("/all")
    public List<Restaurant> getRestaurants() {
        return restaurantService.getAllRestaurants();
    }

    @PostMapping
    public Restaurant addRestaurant(@RequestBody Restaurant restaurant) {
        return restaurantService.addRestaurant(restaurant);
    }
}
