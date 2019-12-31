package garage.parts;

import garage.cars.api.ACars;
import garage.parts.api.ILock;

import static driver.info.DriverInfo.keys;
import static garage.DetermineCar.car;

public class Lock implements ILock {
    private final String[] lockList = {"dsf", "dggg"};
    ACars cars = new ACars() {
        @Override
        public void carInfo() {

        }
    };
    private final String carLock = cars.getLock(); // надо доделать через вызов наследников ACars

    @Override
    public String getCarLock() {
    }

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
        System.out.println("У меня есть ключ от " + car + ".");
    }
}
