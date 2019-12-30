package driver.skills;

import driver.skills.api.IDriverSkills;

class DriverSkills implements IDriverSkills {

    @Override
    public void openCar() {
        System.out.println("Открываю двери машины.");
    }

    @Override
    public void closeCar() {
        System.out.println("Закрываю двери.");
    }

    @Override
    public void driveCar() {
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