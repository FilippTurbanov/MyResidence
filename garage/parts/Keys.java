package garage.parts;

import garage.parts.api.IKeys;

import static driver.info.DriverInfo.*;
import static garage.DetermineCar.car;

public class Keys implements IKeys {
    Lock lock = new Lock();
    final String carLock = lock.getCarLock();

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
        System.out.println("Открываю двери машины.");
    }

    @Override
    public void startCar() {
        System.out.println("Завожу мотор.");
    }

    @Override
    public void closeCar() {
        System.out.println("Закрываю двери.");
    }
}
