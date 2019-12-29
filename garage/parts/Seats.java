package garage.parts;

import garage.parts.api.ISeats;

import static garage.DetermineCar.car;

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
        System.out.println("Сажусь за водительское сиденье.");
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
