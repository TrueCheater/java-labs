package com.example.task4_1.vehicle;

import com.example.task4_1.exceptions.NoFreeSeatsException;
import com.example.task4_1.exceptions.NoSuchPassengerException;
import com.example.task4_1.people.Person;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle<T extends Person> implements VehicleInterface<T> {
    private final int maxSeatsNumber;
    private final List<T> passengers = new ArrayList<>();

    public Vehicle(int MaxSeatsNumber) {
        this.maxSeatsNumber = MaxSeatsNumber;
    }

    @Override
    public int getMaxSeatsNumber() {
        return maxSeatsNumber;
    }

    @Override
    public int getOccupiedSeatsNumber() {
        return passengers.size();
    }

    @Override
    public void putPassenger(T passenger) throws NoFreeSeatsException {
        if (getOccupiedSeatsNumber() == maxSeatsNumber) {
            throw new NoFreeSeatsException("No free seats left");
        } else {
            passengers.add(passenger);
        }
    }

    @Override
    public void dropPassenger(T passenger) throws NoSuchPassengerException {
        if (passengers.contains(passenger)) {
            passengers.remove(passenger);
        } else {
            throw new NoSuchPassengerException("Passenger to drop is not found");
        }
    }

    public List<T> getPassengers() {
        return passengers;
    }

    @Override
    public String toString() {
        return "Vehicle: " +
                "seats=" + getMaxSeatsNumber() +
                ", passengers=" + getPassengers();
    }
}
