package com.project.food_order_backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.project.food_order_backend.model.MenuItem;

@Repository
public interface Menu_Repo extends JpaRepository<MenuItem, Long> {

    // Find menu items by name
    List<MenuItem> findByName(String name);

    // Find menu items cheaper than given price
    List<MenuItem> findByPriceLessThan(double price);

    // Find menu items by category
    //List<MenuItem> findByCategory(String category);

}