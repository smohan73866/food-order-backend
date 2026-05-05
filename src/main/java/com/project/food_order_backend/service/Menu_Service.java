package com.project.food_order_backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.food_order_backend.model.MenuItem;
import com.project.food_order_backend.repo.Menu_Repo;

@Service
public class Menu_Service {

    @Autowired
    private Menu_Repo menuRepo;

    public List<MenuItem> getAllMenuItems() {
        return menuRepo.findAll();
    }

    public MenuItem addMenuItem(MenuItem item) {
        return menuRepo.save(item);
    }
}