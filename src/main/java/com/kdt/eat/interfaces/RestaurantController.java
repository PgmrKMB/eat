package com.kdt.eat.interfaces;

import java.util.ArrayList;
import java.util.List;

import com.kdt.eat.domain.Restaurant;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class RestaurantController {
    
    @GetMapping(value="/restaurants")
    public List<Restaurant> list() {

        List<Restaurant> restaurants = new ArrayList<>();
        
        Restaurant restaurant = new Restaurant(1004, "Bob zip", "Seoul");
        
        restaurants.add(restaurant);

        return restaurants;
    }
    

    @GetMapping(value="/restaurants/1004")
    public Restaurant getMethodName() {
        Restaurant restaurant = new Restaurant(1004L, "Bob zip", "Seoul");
        return restaurant;
    }
    

}
