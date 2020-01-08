package garage.cars.api;

import garage.parts.Lock;

public abstract class ACars implements ICar {
    private boolean isDoorOpened = false;
    private boolean isDriving = false;
    private boolean isEngineStarted = false;
    Lock checkLock = new Lock();
    private String lock;

    public String getLock() {
        return lock;
    }

    @Override
    public void driveCar() {
        if (isDoorOpened)
            throw new IllegalArgumentException("Перед выездом закройте все двери.");
        else if (isDriving)
            throw new IllegalArgumentException("Машина уже едет.");
        else {
            isDriving = true;
            System.out.println("Поехал.");
        }
    }

    @Override
    public void openCar(String key) {
        System.out.println("Открываю двери машины.");
        if (checkLock.keyCheck(key, getLock())) {
            if (!isDoorOpened)
                isDoorOpened = true;
            else
                throw new IllegalArgumentException("Дверь уже открыта.");
        }
        else
            System.out.println("У меня нет ключа от этой машины.");
    }

    @Override
    public void closeCar(String key) {
        System.out.println("Закрываю двери.");
        if (checkLock.keyCheck(key, getLock())) {
            if (isDoorOpened)
                isDoorOpened = false;
            else
                throw new IllegalArgumentException("Нельзя закрыть закрытые двери.");
        }
        else
            System.out.println("У меня нет ключа от этой машины.");
    }

    @Override
    public void startCar() {
        System.out.println("Завожу мотор.");
        if (!isEngineStarted)
            isEngineStarted = true;
        else
            throw new IllegalArgumentException("Нельзя завести заведенный мотор.");
    }

    @Override
    public void stopCar() {
        System.out.println("Останавливаюсь.");
        if (isEngineStarted) {
            isEngineStarted = false;
            isDriving = false;
            }
        else if (!isDriving)
            throw new IllegalArgumentException("Нельзя заглушить выключенный мотор.");
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
        if (isDoorOpened)
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
}
