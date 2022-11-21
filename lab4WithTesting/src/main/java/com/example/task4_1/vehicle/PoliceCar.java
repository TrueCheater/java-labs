package com.example.task4_1.vehicle;

import com.example.task4_1.people.Policeman;

public class PoliceCar extends Car<Policeman> {
    public PoliceCar(Integer seatsNumber) {
        super(seatsNumber);
    }

    @Override
    public String toString() {
        return "PoliceCar: " +
                "seats=" + getMaxSeatsNumber() +
                ", passengers=" + getPassengers();
    }
}
