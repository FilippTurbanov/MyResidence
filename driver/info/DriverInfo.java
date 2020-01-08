package driver.info;

import driver.info.api.IDriverInfo;
import driver.skills.DriverSkills;

import java.util.Random;

public class DriverInfo implements IDriverInfo {
    private Random rnd = new Random();
    DriverSkills driverSkills = new DriverSkills();

    @Override
    public String driversName() {
        return "Александр";
    }

    @Override
    public int drivingExperience() {
        return (rnd.nextInt(14) + 2);
    }

    @Override
    public void driverInfo() {
        System.out.println("Имя водителя: " + driversName());
        System.out.print("Стаж вождения: ");
        int temp = drivingExperience();
        if ((temp >= 2) && (temp <= 4)) {
            System.out.println(temp + " года");
        }
        else {
            System.out.println(temp + " лет");
        }
        System.out.println("Наличие прав категории: " + driverSkills.getCategory());
    }
}
