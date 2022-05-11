package com.kdt.eat.interfaces;

import java.util.ArrayList;
import java.util.List;


import com.kdt.eat.domain.Restaurant;
import com.kdt.eat.domain.RestaurantRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class RestaurantController {

    private RestaurantRepository repository = new RestaurantRepository();
    
    @GetMapping(value="/restaurants")
    public List<Restaurant> list() {

        // List<Restaurant> restaurants = new ArrayList<>();
        
        // Restaurant restaurant = new Restaurant(1004, "Bob zip", "Seoul");
        
        // restaurants.add(restaurant);


        List<Restaurant> restaurants = repository.findAll();

        return restaurants;
    }
    

    @GetMapping(value="/restaurants/{id}")
    public Restaurant getMethodName(@PathVariable("id") Long id) {
        // List<Restaurant> restaurants = new ArrayList<>();
        // restaurants.add(new Restaurant(1004L, "Bob zip", "Seoul"));
        // restaurants.add(new Restaurant(2020L, "Cyber Food", "Seoul"));

        // for(Restaurant rest : restaurants){
        //     rest.getId().equals(id);
        // }


        // Restaurant restaurant = restaurants.stream()
        // .filter(r -> r.getId().equals(id))
        // .findFirst()
        // .orElse(null);

        Restaurant restaurant = repository.findById(id);

        return restaurant;
    }
    

}
