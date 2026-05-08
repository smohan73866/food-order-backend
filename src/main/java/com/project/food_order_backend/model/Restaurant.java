package com.project.food_order_backend.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double rating;
    private String image;
    private String location;

    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<MenuItem> menuItems;
}