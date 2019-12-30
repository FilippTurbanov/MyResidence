package garage.parts;

import garage.parts.api.ILock;

import static garage.DetermineCar.car;

public class Lock implements ILock {

    @Override
    public String getCarLock() {
        return car;
    }
}
