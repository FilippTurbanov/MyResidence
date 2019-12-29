package garage;

import driver.info.DriverInfo;
import garage.parts.DriverLicence;
import garage.parts.Keys;

import static garage.DetermineCar.car;

public class GarageMain {
    public static void main(String[] args) {
        DriverInfo driver = new DriverInfo();
        driver.driverInfo();
        System.out.println();
        Keys keys = new Keys();
        DriverLicence licence = new DriverLicence();
        System.out.println("Захожу в гараж. Там стоит " + car + ".");
        switch (car) {
            case "Audi":
                // описание машины
            case "BMW":
                // описание машины
            case "Mercedes":
                // описание машины
        }
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

    }
}
