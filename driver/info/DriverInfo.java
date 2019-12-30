package driver.info;

import driver.info.api.IDriverInfo;

import java.util.Random;

import static garage.DetermineCar.carsAmount;
import static garage.DetermineCar.garage;

public class DriverInfo implements IDriverInfo {
    private Random rnd = new Random();

    @Override
    public String driversName() {
        return "Александр";
    }

    @Override
    public int drivingExperience() {
        return (rnd.nextInt(14) + 2);
    }

    private static char licenceCategories() {
        Random rnd = new Random();
        if (rnd.nextInt(2) == 0)
            return 'B';
        else
            return 'C';
    }

    private static String [] carKeys() {
        Random rnd = new Random();
        String[] typesOfKeys = new String[2];
        typesOfKeys[0] = garage[rnd.nextInt(carsAmount)];
        typesOfKeys[1] = typesOfKeys[0];
        while (typesOfKeys[0].equals(typesOfKeys[1])) {
            typesOfKeys[1] = garage[rnd.nextInt(carsAmount)];
        }
        return typesOfKeys;
    }

    public final static char category = licenceCategories();
    public final static String [] keys = carKeys();

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
        if (category == 'B')
            System.out.println("Права категории: B");
        else
            System.out.println("Права категорий: B, C");
        System.out.println("Имеются ключи от машин: " + keys[0] + ", " + keys[1]);
    }
}
