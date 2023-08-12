package com.driver;

public class Boat implements WaterVehicle{
    private String name;
    private Boat capacity;

    public Boat(String name, Boat capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String getVehicleName() {
        return this.name;
    }

    @Override
    public Boat getVehicleCapacity() {
        return this.capacity;
    }
}
