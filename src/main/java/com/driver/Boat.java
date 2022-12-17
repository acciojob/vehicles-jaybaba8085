package com.driver;

public class Boat implements WaterVehicle {
    private String name;
    private int capacity;

    @Override
    public String getVehicleName() {
        return name;
    }
    public Boat(String name,int capacity)
    {
        this.name=name;
        this.capacity=capacity;
    }

    @Override
    public int getVehicleCapacity() {

        return capacity;
    }
}
