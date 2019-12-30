package garage.cars.api;

import static garage.parts.Keys.ifDoorsOpened;

public abstract class ACars implements ICar {
    public static boolean isDriving = false;

    @Override
    public void drive() {
        if (ifDoorsOpened)
            throw new IllegalArgumentException("Перед выездом закройте все двери.");
        else if (isDriving)
            throw new IllegalArgumentException("Машина уже едет.");
        else
            System.out.println("Поехал.");
    }

    @Override
    public void open() {
        System.out.println("Открываю двери машины.");
    }

    @Override
    public void close() {
        System.out.println("Закрываю двери.");
    }

    @Override
    public void start() {
        System.out.println("Завожу мотор.");
    }

    @Override
    public void stop() {
        System.out.println("Останавливаюсь.");
    }

    @Override
    public void fuel() {
        System.out.println("Заправляю машину.");
    }

    @Override
    public void changeWheel() {
        System.out.println("Меняю колесо...");
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
}
