package com.project.food_order_backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.project.food_order_backend.model.Restaurant;

@Repository
public interface Restaurant_Repo extends JpaRepository<Restaurant, Long> {

    // Custom query methods (optional)

    // Find restaurants by name
    List<Restaurant> findByName(String name);

    // Find restaurants with rating greater than given value
    List<Restaurant> findByRatingGreaterThan(double rating);

    // Find restaurants by location
    List<Restaurant> findByLocation(String location);
}
