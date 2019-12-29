package garage.parts;

import garage.parts.api.ILock;

import static garage.DetermineCar.car;

public class Lock implements ILock {

    @Override
    public void openCar() {
        System.out.println("Открываю двери машины.");
    }

    @Override
    public void closeCar() {
        System.out.println("Закрываю двери.");
    }

    @Override
    public String getCarLock() {
        return car;
    }
}
