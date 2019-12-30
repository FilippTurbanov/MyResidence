package driver.skills;

import driver.skills.api.IDriverSkills;

import static garage.cars.api.ACars.isDriving;
import static garage.parts.Keys.ifDoorsOpened;

public class DriverSkills implements IDriverSkills {

    @Override
    public void openCar() {
        System.out.println("Открываю дверь машины.");
    }

    @Override
    public void closeCar() {
        System.out.println("Закрываю двери.");
    }

    @Override
    public void driveCar() {
        if (ifDoorsOpened)
            throw new IllegalArgumentException("Перед выездом закройте все двери.");
        else if (isDriving)
            throw new IllegalArgumentException("Машина уже едет.");
        else
            System.out.println("Поехал.");
    }

    @Override
    public void takePassenger() {
        System.out.println("Беру пассажира.");
    }

    @Override
    public void startCar() {
        System.out.println("Завожу мотор.");
    }

    @Override
    public void stopCar() {
        System.out.println("Останавливаюсь.");
    }
}
