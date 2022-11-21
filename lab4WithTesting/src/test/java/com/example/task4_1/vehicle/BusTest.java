package com.example.task4_1.vehicle;

import com.example.task4_1.exceptions.NoFreeSeatsException;
import com.example.task4_1.exceptions.NoSuchPassengerException;
import com.example.task4_1.people.Firefighter;
import com.example.task4_1.people.Person;
import com.example.task4_1.people.Policeman;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BusTest {

    @Test
    void shouldGetMaxSeatsNumber() {
        Bus bus = new Bus(35);
        assertEquals(35, bus.getMaxSeatsNumber());
    }

    @Test
    void shouldGetOccupiedSeatsNumber() throws NoFreeSeatsException {
        Bus bus = new Bus(35);
        Policeman policeman = new Policeman();
        Firefighter firefighter = new Firefighter();
        bus.putPassenger(policeman);
        bus.putPassenger(firefighter);

        assertEquals(2, bus.getOccupiedSeatsNumber());
    }

    @Test
    void shouldPutOnePassenger() throws NoFreeSeatsException {
        Bus bus = new Bus(35);
        Person person = new Person();
        bus.putPassenger(person);

        assertEquals(1, bus.getOccupiedSeatsNumber());
    }

    @Test
    void shouldThrowExceptionWhenBusIsOverflowed() throws NoFreeSeatsException {
        Bus bus = new Bus(1);
        Person person = new Person();
        Policeman policeman = new Policeman();
        bus.putPassenger(person);

        NoFreeSeatsException exc = assertThrows(NoFreeSeatsException.class,
                () -> bus.putPassenger(policeman));
        assertEquals("No free seats left", exc.getMessage());
    }

    @Test
    void shouldDropOnePassenger() throws NoSuchPassengerException, NoFreeSeatsException {
        Bus bus = new Bus(35);
        Policeman policeman = new Policeman();
        Firefighter firefighter = new Firefighter();
        bus.putPassenger(policeman);
        bus.putPassenger(firefighter);
        bus.dropPassenger(firefighter);

        assertEquals(1, bus.getOccupiedSeatsNumber());
    }

    @Test
    void shouldThrowExceptionWhenNoSuchPassengerToDropIsFound() throws NoFreeSeatsException {
        Bus bus = new Bus(35);
        Policeman policeman = new Policeman();
        Firefighter firefighter = new Firefighter();
        Person person = new Person();
        bus.putPassenger(policeman);
        bus.putPassenger(firefighter);

        NoSuchPassengerException exc = assertThrows(NoSuchPassengerException.class,
                () -> bus.dropPassenger(person));
        assertEquals("Passenger to drop is not found", exc.getMessage());
    }

}