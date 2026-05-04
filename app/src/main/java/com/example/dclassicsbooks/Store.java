package com.example.dclassicsbooks;

public class Store {
    private int image;
    private String name;
    private String address;
    private String hours;

    public Store(int image, String name, String address, String hours) {
        this.image = image;
        this.name = name;
        this.address = address;
        this.hours = hours;
    }

    public int getImage() { return image; }
    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getHours() { return hours; }
}