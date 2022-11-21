package com.example.task4_1.vehicle;

import com.example.task4_1.people.Person;

public class Bus extends Vehicle<Person> {
    public Bus(Integer maxSeatsNumber) {
        super(maxSeatsNumber);
    }

    @Override
    public String toString() {
        return "Bus: " +
                "seats=" + getMaxSeatsNumber() +
                ", passengers=" + getPassengers();
    }
}
