package garage.parts;

import garage.parts.api.IKeys;

import static driver.info.DriverInfo.*;
import static garage.DetermineCar.car;

public class Keys implements IKeys {
    private Lock lock = new Lock();
    private final String carLock = lock.getCarLock();
    public static boolean ifDoorsOpened = false;


    @Override
    public boolean keyCheck() {
        return ((keys[0].equals(carLock)) || (keys[1].equals(carLock)));
    }

    @Override
    public void keyCheckFailed() {
        System.out.println("У меня нет ключа от этой машины.");
    }

    @Override
    public void keyCheckSuccessful() {
        if (car.equals("Audi"))
            System.out.println("У меня есть ключ от этой " + car + ".");
        else
            System.out.println("У меня есть ключ от этого " + car + ".");
    }

    @Override
    public void openCar() {
        if (!ifDoorsOpened)
            ifDoorsOpened = true;
        else
            throw new IllegalArgumentException("Дверь уже открыта.");
    }

    @Override
    public void startCar() {
        System.out.println("Завожу мотор.");
    }

    @Override
    public void closeCar() {
        if (ifDoorsOpened)
            ifDoorsOpened = false;
        else
            throw new IllegalArgumentException("Нельзя закрыть закрытые двери.");
    }
}
