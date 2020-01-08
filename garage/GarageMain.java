package garage;

import driver.DriverMain;
import driver.info.DriverInfo;
import garage.cars.Audi;
import garage.parts.engine.AudiEngine;
import garage.parts.engine.api.FuelType;

public class GarageMain {
    public static void main(String[] args) {
        DriverInfo driverInfo = new DriverInfo();
        driverInfo.driverInfo();
        System.out.println();
        System.out.println("Захожу в гараж.");
        Audi audi1 = new Audi("R8", new AudiEngine(90, FuelType.PETROL, "FF123532"), 3, "B", "SimSalabim12345");
        System.out.println("Информация о машине:");
        audi1.carInfo();
        System.out.println();

/*        Примеры вызова других машин:
        Audi audi2 = new Audi("R8", new NoNameEngine(90, FuelType.PETROL, "FF123532"), 3, "B", "AbraKadabra"));
        BMW bmw1 = new BMW("X5", new BMW_Engine(95, FuelType.DIESEL, "PH946137"), 6, "C", "lolkekcheburek");
        BMW bmw2 = new BMW("X5", new NoNameEngine(95, FuelType.DIESEL, "PH946137"), 6, "C", "asdfa1");
        Mercedes mercedes1 = new Mercedes("AMG", new MercedesEngine(83, FuelType.PETROL, "CM251711"), 4, "B", "razdvatri");
        Mercedes mercedes2 = new Mercedes("AMG", new NoNameEngine(83, FuelType.PETROL, "CM251711"), 4, "B", "fatality");*/

        System.out.println("Ищу ключи от машины...");
        boolean next = false;
        audi1.keyCheckReport();
        if (audi1.keyCheck()) {
            System.out.println("Проверяю наличие прав...");
            audi1.categoryCheckReport();
            if (audi1.categoryCheck())
                next = true;
        }
        System.out.println();
        if (next) {
            DriverMain main = new DriverMain();
            main.driverActions();
        }
    }
}
