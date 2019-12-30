package garage;

import java.util.Random;

public class DetermineCar {
    public static String[] garage = new String[] {"Audi", "BMW", "Mercedes"};
    public final static int carsAmount = garage.length;
    private static String determineCar() {
        Random random = new Random();
        return garage[random.nextInt(carsAmount)];
    }
    public final static String car = determineCar();
}
