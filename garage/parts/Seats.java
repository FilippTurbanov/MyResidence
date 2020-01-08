package garage.parts;

import garage.parts.api.ISeats;

public class Seats implements ISeats {
    int seatsNumber;

    @Override
    public int setSeats(int seatsNumber) {
        return this.seatsNumber = seatsNumber;
    }

    @Override
    public int getSeats() {
        return seatsNumber;
    }

    @Override
    public void seatsInfo() {
        System.out.println("Количество мест для пассажиров: " + getSeats());
    }
}
