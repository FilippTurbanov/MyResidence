package driver.skills;

import driver.skills.api.IDriverSkills;
import garage.cars.api.ACars;

public class DriverSkills implements IDriverSkills {
    ACars car = new ACars() {
        @Override
        public void carInfo() {
        }
    };

    @Override
    public void openCar() {
        car.openCar();
    }

    @Override
    public void closeCar() {
       car.closeCar();
    }

    @Override
    public void driveCar() {
       car.driveCar();
    }

    @Override
    public void takePassenger() {
       car.takePassenger();
    }

    @Override
    public void startCar() {
        car.startCar();
    }

    @Override
    public void stopCar() {
        car.stopCar();
    }

    @Override
    public void driverSeat() {
        car.driverSeat();
    }

    @Override
    public void passengerSeat() {
       car.passengerSeat();
    }
}
