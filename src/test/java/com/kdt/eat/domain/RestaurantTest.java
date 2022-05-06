package com.kdt.eat.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class RestaurantTest {

    @Test
    public void creation() {
        Restaurant restaurant = new Restaurant(1004L, "Bob zip", "Seoul");
        
        assertEquals(restaurant.getName(), "Bob zip");
    }
    
    @Test
    public void information() {
        Restaurant restaurant = new Restaurant(1004L, "Bob zip","Seoul");
        assertEquals(restaurant.getInformation(), "Bob zip in Seoul");
    }

    
    // @Autowired
    // Restaurant restaurant;

    // @Test
    // public void test() {
    //     assertEquals(restaurant.getAddress("Seoul"), "hi Seoul");
    // }

}
