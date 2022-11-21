package com.example.task4_1.vehicle;

import com.example.task4_1.exceptions.NoFreeSeatsException;
import com.example.task4_1.exceptions.NoSuchPassengerException;
import com.example.task4_1.people.Policeman;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PoliceCarTest {

    @Test
    void shouldGetMaxSeatsNumber() {
        PoliceCar policeCar = new PoliceCar(5);
        assertEquals(5, policeCar.getMaxSeatsNumber());
    }

    @Test
    void shouldGetOccupiedSeatsNumber() throws NoFreeSeatsException {
        PoliceCar policeCar = new PoliceCar(5);
        Policeman policeman1 = new Policeman();
        Policeman policeman2 = new Policeman();
        Policeman policeman3 = new Policeman();
        policeCar.putPassenger(policeman1);
        policeCar.putPassenger(policeman2);
        policeCar.putPassenger(policeman3);

        assertEquals(3, policeCar.getOccupiedSeatsNumber());
    }

    @Test
    void shouldPutOnePoliceman() throws NoFreeSeatsException {
        PoliceCar policeCar = new PoliceCar(5);
        Policeman policeman1 = new Policeman();

        policeCar.putPassenger(policeman1);
        assertEquals(1, policeCar.getOccupiedSeatsNumber());
    }

    @Test
    void shouldThrowExceptionWhenPoliceCarIsOverflowed() throws NoFreeSeatsException {
        PoliceCar policeCar = new PoliceCar(1);
        Policeman policeman1 = new Policeman();
        Policeman policeman2 = new Policeman();
        policeCar.putPassenger(policeman1);

        NoFreeSeatsException exc = assertThrows(NoFreeSeatsException.class,
                () -> policeCar.putPassenger(policeman2));
        assertEquals("No free seats left", exc.getMessage());
    }

    @Test
    void shouldDropOnePoliceman() throws NoFreeSeatsException, NoSuchPassengerException {
        PoliceCar policeCar = new PoliceCar(2);
        Policeman policeman1 = new Policeman();
        Policeman policeman2 = new Policeman();
        policeCar.putPassenger(policeman1);
        policeCar.putPassenger(policeman2);

        policeCar.dropPassenger(policeman2);
        assertEquals(1, policeCar.getOccupiedSeatsNumber());
    }

    @Test
    void shouldThrowExceptionWhenNoSuchPolicemanToDropIsFound() throws NoFreeSeatsException {
        PoliceCar policeCar = new PoliceCar(2);
        Policeman policeman1 = new Policeman();
        Policeman policeman2 = new Policeman();
        Policeman policeman3 = new Policeman();

        policeCar.putPassenger(policeman1);
        policeCar.putPassenger(policeman2);

        NoSuchPassengerException exc = assertThrows(NoSuchPassengerException.class,
                () -> policeCar.dropPassenger(policeman3));
        assertEquals("Passenger to drop is not found", exc.getMessage());
    }
}