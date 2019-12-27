package garage;

import garage.cars.Mercedes;
import garage.parts.api.IEngine;
import garage.parts.api.IKeys;
import garage.parts.api.ILock;

public class GarageMain {
    public static void main(String[] args) {
        Mercedes mers = new Mercedes();
        ILock lock = new ILock() {
            @Override
            public void openLock() {
                System.out.println("Открываю дверь.");
            }
        };
        IKeys keys = new IKeys() {
            @Override
            public void checkKeys() {
                System.out.println("Подбираю ключ.");
            }

            @Override
            public void startEngine() {
                System.out.println("Завожу машину.");
            }
        };
        IEngine engine = new IEngine() {
            @Override
            public void volumeInfo() {
                System.out.println("Уровень топлива критический!");
            }

            @Override
            public void fuelInfo() {

            }

            @Override
            public void engineModelInfo() {

            }
        };
        keys.checkKeys();
        lock.openLock();
        mers.open();
        mers.driverSeat();
        mers.close();
        keys.startEngine();
        mers.start();
        mers.drive();
        mers.fuel();
        engine.volumeInfo();
        mers.stop();
    }
}
