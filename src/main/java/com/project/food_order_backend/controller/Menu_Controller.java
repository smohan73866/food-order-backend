package com.project.food_order_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.food_order_backend.model.MenuItem;
import com.project.food_order_backend.service.Menu_Service;

@RestController
@RequestMapping("/menu")
@CrossOrigin("*")
public class Menu_Controller {

    @Autowired
    private Menu_Service menuService;

    @GetMapping("/restaurant/{id}")
    public List<MenuItem> getMenuByRestaurant(@PathVariable Long id) {
        return menuService.getMenuByRestaurantId(id);
    }

    @GetMapping
    public List<MenuItem> getMenu() {
        return menuService.getAllMenuItems();
    }

    @PostMapping
    public MenuItem addMenuItem(@RequestBody MenuItem item) {
        return menuService.addMenuItem(item);
    }
}
