package com.example.task4_1.vehicle;

import com.example.task4_1.people.Firefighter;

public class FireTruck extends Car<Firefighter> {
    public FireTruck(Integer seatsNumber) {
        super(seatsNumber);
    }

    @Override
    public String toString() {
        return "FireTruck: " +
                "seats=" + getMaxSeatsNumber() +
                ", passengers=" + getPassengers();
    }
}
