package garage.cars;

import driver.skills.DriverSkills;
import garage.cars.api.ACars;
import garage.parts.DriverLicence;
import garage.parts.Lock;
import garage.parts.engine.api.IEngine;
import garage.parts.wheel.WheelInfo;

public class BMW extends ACars {
    private boolean isDoorOpened = false;
    private boolean isDriving = false;
    private boolean isEngineStarted = false;
    private String model;
    private IEngine engine;
    private int seatsNumber;
    private String requiredCategory;
    private String lock;

    public BMW(String model, IEngine engine, int seatsNumber, String requiredCategory, String lock) {
        this.model = model;
        this.engine = engine;
        this.seatsNumber = seatsNumber;
        this.requiredCategory = requiredCategory;
        this.lock = lock;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return "BMW";
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public String getRequiredCategory() {
        return requiredCategory;
    }

    DriverLicence driverLicence = new DriverLicence();
    DriverSkills driverSkills = new DriverSkills();

    public boolean categoryCheck() {
        return driverLicence.categoryCheck(driverSkills.getCategory(), requiredCategory);
    }

    public void categoryCheckReport() {
        if (categoryCheck())
            driverLicence.categoryCheckSuccess();
        else
            driverLicence.categoryCheckFailed();
    }

    public String getLock() {
        return lock;
    }

    Lock checkLock = new Lock();
    public boolean keyCheck() {
        return checkLock.keyCheck(driverSkills.getKey(), getLock());
    }

    public void keyCheckReport() {
        if (keyCheck())
            checkLock.keyCheckSuccessful();
        else
            checkLock.keyCheckFailed();
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

    @Override
    public void carInfo() {
        System.out.println("Марка: " + getBrand());
        System.out.println("Модель: " + getModel());
        System.out.println("Мотор: " + engine.getEngineName());
        System.out.println("Серийный номер мотора: " + engine.getId());
        System.out.println("Расход топлива: " + engine.fuelConsuming());
        System.out.println("Емкость бака: " + engine.getCapacity());
        System.out.print("Тип топлива: ");
        switch (engine.getFuelType()) {
            case DIESEL:
                System.out.println("дизельное");
                break;
            case PETROL:
                System.out.println("бензин");
                break;
        }
        System.out.println("Количество мест для пассажиров: " + getSeatsNumber());
        WheelInfo wheels = new WheelInfo();
        wheels.getWheelInfo();
        System.out.println("Требуемая категория прав для управления ТС: " + getRequiredCategory());
    }
}
