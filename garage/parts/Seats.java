package garage.parts;

import garage.parts.api.ISeats;

import static garage.DetermineCar.car;

public class Seats implements ISeats {

    @Override
    public int seatsNumber() { // менять
        if (car.equals("BMW"))
            return 6;
        else
            return 4;
    }

    @Override
    public void seatsInfo() {
        System.out.println("Количество мест для пассажиров: " + seatsNumber());
    }
}
