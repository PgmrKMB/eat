package com.kdt.eat.domain;

import java.util.ArrayList;
import java.util.List;

public class RestaurantRepository {

    public List<Restaurant> findAll() {

        List<Restaurant> restaurants = new ArrayList<>();

        restaurants.add(new Restaurant(1004L, "Bob zip", "Seoul"));
        restaurants.add(new Restaurant(2020L, "Cyber Food", "Seoul"));

        return restaurants;
    }

    public Restaurant findById(Long id) {

        List<Restaurant> restaurants = findAll();

        Restaurant restaurant = restaurants.stream()
        .filter(r -> r.getId().equals(id))
        .findFirst()
        .orElse(null);

        return restaurant;
    }

}
