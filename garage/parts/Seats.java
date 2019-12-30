package garage.parts;

import garage.parts.api.ISeats;

import static garage.DetermineCar.car;
import static garage.parts.Keys.ifDoorsOpened;

public class Seats implements ISeats {

    @Override
    public int seatsNumber() {
        if (car.equals("BMW"))
            return 6;
        else
            return 4;
    }

    @Override
    public void driverSeat() {
        if (ifDoorsOpened)
            System.out.println("Сажусь за водительское сиденье.");
        else
            throw new IllegalArgumentException("Сначала открой дверь.");
    }

    @Override
    public void passengerSeat() {
        System.out.println("Пассажир сел в машину.");
    }

    @Override
    public void takePassenger() {
        System.out.println("Беру пассажира.");
    }

    @Override
    public void seatsInfo() {
        System.out.println("Количество мест для пассажиров: " + seatsNumber());
    }
}
