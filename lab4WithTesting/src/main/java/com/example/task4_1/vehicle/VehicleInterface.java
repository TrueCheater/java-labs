package com.example.task4_1.vehicle;

import com.example.task4_1.exceptions.NoFreeSeatsException;
import com.example.task4_1.exceptions.NoSuchPassengerException;
import com.example.task4_1.people.Person;

public interface VehicleInterface<T extends Person> {
    int getMaxSeatsNumber();

    int getOccupiedSeatsNumber();

    void putPassenger(T passenger) throws NoFreeSeatsException;

    void dropPassenger(T passenger) throws NoSuchPassengerException;
}
