package com.example.task4_1;

import com.example.task4_1.people.Person;
import com.example.task4_1.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Road {
    public List<Vehicle<? extends Person>> carsInRoad = new ArrayList<>();

    public int getCountOfHumans() {
        return carsInRoad.stream()
                .mapToInt(Vehicle::getOccupiedSeatsNumber)
                .sum();
    }

    public void addCarToRoad(Vehicle<? extends Person> vehicle) {
        carsInRoad.add(vehicle);
    }

    @Override
    public String toString() {
        return "Road{" +
                "carsInRoad=" + carsInRoad +
                '}';
    }
}
