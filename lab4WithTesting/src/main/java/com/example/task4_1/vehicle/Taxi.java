package com.example.task4_1.vehicle;

import com.example.task4_1.people.Person;

public class Taxi extends Car<Person> {
    public Taxi(Integer seatsNumber) {
        super(seatsNumber);
    }

    @Override
    public String toString() {
        return "Taxi: " +
                "seats=" + getMaxSeatsNumber() +
                ", passengers=" + getPassengers();
    }
}
