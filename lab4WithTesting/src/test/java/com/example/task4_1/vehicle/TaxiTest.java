package com.example.task4_1.vehicle;

import com.example.task4_1.exceptions.NoFreeSeatsException;
import com.example.task4_1.exceptions.NoSuchPassengerException;
import com.example.task4_1.people.Firefighter;
import com.example.task4_1.people.Person;
import com.example.task4_1.people.Policeman;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxiTest {

    @Test
    void shouldGetMaxSeatsNumber() {
        Taxi taxi = new Taxi(4);
        assertEquals(4, taxi.getMaxSeatsNumber());
    }

    @Test
    void shouldGetOccupiedSeatsNumber() throws NoFreeSeatsException {
        Taxi taxi = new Taxi(4);
        Policeman policeman = new Policeman();
        Firefighter firefighter = new Firefighter();
        taxi.putPassenger(policeman);
        taxi.putPassenger(firefighter);

        assertEquals(2, taxi.getOccupiedSeatsNumber());
    }

    @Test
    void shouldPutOnePassenger() throws NoFreeSeatsException {
        Taxi taxi = new Taxi(4);
        Person person = new Person();
        taxi.putPassenger(person);

        assertEquals(1, taxi.getOccupiedSeatsNumber());
    }

    @Test
    void shouldThrowExceptionWhenTaxiIsOverflowed() throws NoFreeSeatsException {
        Taxi taxi = new Taxi(1);
        Person person = new Person();
        Policeman policeman = new Policeman();
        taxi.putPassenger(person);

        NoFreeSeatsException exc = assertThrows(NoFreeSeatsException.class,
                () -> taxi.putPassenger(policeman));
        assertEquals("No free seats left", exc.getMessage());
    }

    @Test
    void shouldDropOnePassenger() throws NoSuchPassengerException, NoFreeSeatsException {
        Taxi taxi = new Taxi(4);
        Policeman policeman = new Policeman();
        Firefighter firefighter = new Firefighter();
        taxi.putPassenger(policeman);
        taxi.putPassenger(firefighter);
        taxi.dropPassenger(firefighter);

        assertEquals(1, taxi.getOccupiedSeatsNumber());
    }

    @Test
    void shouldThrowExceptionWhenNoSuchPassengerToDropIsFound() throws NoFreeSeatsException {
        Taxi taxi = new Taxi(4);
        Policeman policeman = new Policeman();
        Firefighter firefighter = new Firefighter();
        Person person = new Person();
        taxi.putPassenger(policeman);
        taxi.putPassenger(firefighter);

        NoSuchPassengerException exc = assertThrows(NoSuchPassengerException.class,
                () -> taxi.dropPassenger(person));
        assertEquals("Passenger to drop is not found", exc.getMessage());
    }
}