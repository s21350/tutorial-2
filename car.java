package com.company;

public class car<capacity> {
    String color;
    String brand;
    int capacity;

    public car (String color, String brand, int capacity){
        this.color = color;
        this.brand = brand;
        this.capacity = capacity;
    }

    String color() { return this.color; }
    String brand () { return this.brand; }
    public void capacity (int capacity) {
        this.capacity= capacity; }


    public boolean ishighspeed () {
        if (capacity >= 21) {
            return true;
        } else {
            return false;
        }
    }
}
