package com.example.task4_1;

import com.example.task4_1.exceptions.NoFreeSeatsException;
import com.example.task4_1.people.Firefighter;
import com.example.task4_1.people.Person;
import com.example.task4_1.people.Policeman;
import com.example.task4_1.vehicle.Bus;
import com.example.task4_1.vehicle.FireTruck;
import com.example.task4_1.vehicle.PoliceCar;
import com.example.task4_1.vehicle.Taxi;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoadTest {

    @Test
    void shouldGetCountOfHumans() throws NoFreeSeatsException {
        assertEquals(18, getRoad().getCountOfHumans());
    }

    private static Road getRoad() throws NoFreeSeatsException {
        Bus bus = new Bus(35);
        bus.putPassenger(new Person());
        bus.putPassenger(new Firefighter());
        bus.putPassenger(new Policeman());
        bus.putPassenger(new Person());
        bus.putPassenger(new Firefighter());
        bus.putPassenger(new Policeman());

        FireTruck fireTruck = new FireTruck(15);
        fireTruck.putPassenger(new Firefighter());
        fireTruck.putPassenger(new Firefighter());
        fireTruck.putPassenger(new Firefighter());
        fireTruck.putPassenger(new Firefighter());
        fireTruck.putPassenger(new Firefighter());

        PoliceCar policeCar = new PoliceCar(5);
        policeCar.putPassenger(new Policeman());
        policeCar.putPassenger(new Policeman());
        policeCar.putPassenger(new Policeman());

        Taxi taxi = new Taxi(4);
        taxi.putPassenger(new Policeman());
        taxi.putPassenger(new Firefighter());
        taxi.putPassenger(new Policeman());
        taxi.putPassenger(new Person());

        Road road = new Road();
        road.addCarToRoad(bus);
        road.addCarToRoad(policeCar);
        road.addCarToRoad(fireTruck);
        road.addCarToRoad(taxi);

        return road;
    }
}