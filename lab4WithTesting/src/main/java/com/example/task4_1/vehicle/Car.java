package com.example.task4_1.vehicle;

import com.example.task4_1.people.Person;

public abstract class Car<T extends Person> extends Vehicle<T> {
    public Car(Integer seatsNumber) {
        super(seatsNumber);
    }

    @Override
    public String toString() {
        return "Car: " +
                "seats=" + getMaxSeatsNumber() +
                ", passengers=" + getPassengers();
    }
}
