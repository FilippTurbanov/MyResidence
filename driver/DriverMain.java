package driver;

import driver.skills.DriverSkills;
import garage.cars.Audi;
import garage.parts.engine.AudiEngine;
import garage.parts.engine.api.FuelType;

public class DriverMain {
    public void driverActions() {
        DriverSkills driver = new DriverSkills();
        String key = driver.getKey();
        Audi audi1 = new Audi("R8", new AudiEngine(90, FuelType.PETROL, "FF123532"), 3, "B", "SimSalabim12345");
        audi1.openCar(key);
        audi1.driverSeat();
        audi1.closeCar(key);
        audi1.startCar();
        audi1.driveCar();
        System.out.println("Уровень топлива низкий.");
        audi1.stopCar();
    }
}
