package com.example.task4_1.vehicle;

import com.example.task4_1.exceptions.NoFreeSeatsException;
import com.example.task4_1.exceptions.NoSuchPassengerException;
import com.example.task4_1.people.Firefighter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FireTruckTest {

    @Test
    void shouldGetMaxSeatsNumber() {
        FireTruck fireTruck = new FireTruck(15);
        assertEquals(15, fireTruck.getMaxSeatsNumber());
    }

    @Test
    void shouldGetOccupiedSeatsNumber() throws NoFreeSeatsException {
        FireTruck fireTruck = new FireTruck(15);
        Firefighter firefighter1 = new Firefighter();
        Firefighter firefighter2 = new Firefighter();
        Firefighter firefighter3 = new Firefighter();
        fireTruck.putPassenger(firefighter1);
        fireTruck.putPassenger(firefighter2);
        fireTruck.putPassenger(firefighter3);

        assertEquals(3, fireTruck.getOccupiedSeatsNumber());
    }

    @Test
    void shouldPutOneFirefighter() throws NoFreeSeatsException {
        FireTruck fireTruck = new FireTruck(15);
        Firefighter firefighter1 = new Firefighter();
        fireTruck.putPassenger(firefighter1);

        assertEquals(1, fireTruck.getOccupiedSeatsNumber());
    }

    @Test
    void shouldThrowExceptionWhenFireTruckIsOverflowed() throws NoFreeSeatsException {
        FireTruck fireTruck = new FireTruck(1);
        Firefighter firefighter1 = new Firefighter();
        Firefighter firefighter2 = new Firefighter();
        fireTruck.putPassenger(firefighter1);

        NoFreeSeatsException exc = assertThrows(NoFreeSeatsException.class,
                () -> fireTruck.putPassenger(firefighter2));
        assertEquals("No free seats left", exc.getMessage());
    }

    @Test
    void shouldDropOneFirefighter() throws NoFreeSeatsException, NoSuchPassengerException {
        FireTruck fireTruck = new FireTruck(15);
        Firefighter firefighter1 = new Firefighter();
        Firefighter firefighter2 = new Firefighter();
        fireTruck.putPassenger(firefighter1);
        fireTruck.putPassenger(firefighter2);
        fireTruck.dropPassenger(firefighter1);

        assertEquals(1, fireTruck.getOccupiedSeatsNumber());
    }

    @Test
    void shouldThrowExceptionWhenNoSuchFirefighterToDropIsFound() throws NoFreeSeatsException {
        FireTruck fireTruck = new FireTruck(15);
        Firefighter firefighter1 = new Firefighter();
        Firefighter firefighter2 = new Firefighter();
        Firefighter firefighter3 = new Firefighter();
        fireTruck.putPassenger(firefighter1);
        fireTruck.putPassenger(firefighter2);

        NoSuchPassengerException exc = assertThrows(NoSuchPassengerException.class,
                () -> fireTruck.dropPassenger(firefighter3));
        assertEquals("Passenger to drop is not found", exc.getMessage());
    }
}