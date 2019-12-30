package garage;

import driver.info.DriverInfo;
import driver.skills.DriverSkills;
import garage.cars.Audi;
import garage.cars.BMW;
import garage.cars.Mercedes;
import garage.parts.DriverLicence;
import garage.parts.Keys;
import garage.parts.Seats;
import garage.parts.engine.AudiEngine;
import garage.parts.engine.BMW_Engine;
import garage.parts.engine.MercedesEngine;
import garage.parts.engine.NoNameEngine;
import garage.parts.engine.api.FuelType;

import java.util.Random;

import static garage.DetermineCar.car;

public class GarageMain {
    public static void main(String[] args) {
        DriverInfo driverInfo = new DriverInfo();
        driverInfo.driverInfo();
        System.out.println();
        Keys keys = new Keys();
        DriverLicence licence = new DriverLicence();
        System.out.println("Захожу в гараж. Там стоит " + car + ".");
        Random rndEngine = new Random();
        final boolean modelEngine = rndEngine.nextBoolean();
        System.out.println();
        System.out.println("Достаю ключ от машины...");
        boolean keyCheck = keys.keyCheck();
        if (keyCheck) {
            keys.keyCheckSuccessful();
            if (licence.categoryCheck())
                licence.categoryCheckSuccess();
            else
                licence.categoryCheckFailed();
        }
        else
            keys.keyCheckFailed();
        System.out.println();
        if (keyCheck && licence.categoryCheck()) {
            System.out.println("Информация о машине:");
            DriverSkills driver = new DriverSkills();
            Seats seat = new Seats();
            Keys key = new Keys();
            switch (car) {
                case "Audi":
                    if (modelEngine) {
                        Audi audi1 = new Audi("R8", new AudiEngine(90, FuelType.PETROL, "FF123532"));
                        audi1.carInfo();
                        System.out.println();
                        driver.openCar();
                        key.openCar();
                        seat.driverSeat();
                        driver.closeCar();
                        key.closeCar();
                        audi1.start();
                        driver.driveCar();
                        System.out.println("Уровень топлива низкий.");
                        audi1.stop();
                    } else {
                        Audi audi2 = new Audi("R8", new NoNameEngine(90, FuelType.PETROL, "FF123532"));
                        audi2.carInfo();
                        System.out.println();
                        driver.openCar();
                        key.openCar();
                        seat.driverSeat();
                        driver.closeCar();
                        key.closeCar();
                        audi2.start();
                        driver.driveCar();
                        System.out.println("Уровень топлива низкий.");
                        audi2.stop();
                    }
                    break;
                case "BMW":
                    if (modelEngine) {
                        BMW bmw1 = new BMW("X5", new BMW_Engine(95, FuelType.DIESEL, "PH946137"));
                        bmw1.carInfo();
                        System.out.println();
                        driver.openCar();
                        key.openCar();
                        seat.driverSeat();
                        driver.closeCar();
                        key.closeCar();
                        bmw1.start();
                        driver.driveCar();
                        System.out.println("Уровень топлива низкий.");
                        bmw1.stop();
                    } else {
                        BMW bmw2 = new BMW("X5", new NoNameEngine(95, FuelType.DIESEL, "PH946137"));
                        bmw2.carInfo();
                        System.out.println();
                        driver.openCar();
                        key.openCar();
                        seat.driverSeat();
                        driver.closeCar();
                        key.closeCar();
                        bmw2.start();
                        driver.driveCar();
                        System.out.println("Уровень топлива низкий.");
                        bmw2.stop();
                    }
                    break;
                case "Mercedes":
                    if (modelEngine) {
                        Mercedes mercedes1 = new Mercedes("AMG", new MercedesEngine(83, FuelType.PETROL, "CM251711"));
                        mercedes1.carInfo();
                        System.out.println();
                        driver.openCar();
                        key.openCar();
                        seat.driverSeat();
                        driver.closeCar();
                        key.closeCar();
                        mercedes1.start();
                        driver.driveCar();
                        System.out.println("Уровень топлива низкий.");
                        mercedes1.stop();
                    } else {
                        Mercedes mercedes2 = new Mercedes("AMG", new NoNameEngine(83, FuelType.PETROL, "CM251711"));
                        mercedes2.carInfo();
                        System.out.println();
                        driver.openCar();
                        key.openCar();
                        seat.driverSeat();
                        driver.closeCar();
                        key.closeCar();
                        mercedes2.start();
                        driver.driveCar();
                        System.out.println("Уровень топлива низкий.");
                        mercedes2.stop();
                    }
                    break;
            }
        }

    }
}
