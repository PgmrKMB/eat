package com.kdt.eat.domain;

public class Restaurant {

    private Long id;
    private String name;
    private String address;

    public Restaurant(long id, String name, String address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public Restaurant(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public String getAddress(){
        return address;
    }
    public String getInformation() {
        return name + " in " + address;
    }

    // public String getAddress(String address) {
    //     return "hi " + address;
    // }

}
