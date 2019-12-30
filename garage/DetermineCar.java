package garage;

import java.util.Random;

public class DetermineCar {
    private static String determineCar() {
        Random random = new Random();
        final String car;
        if (random.nextInt(3) == 0) {
            car = "Audi";
        }
        else if (random.nextInt(3) == 1) {
            car = "BMW";
        }
        else {
            car = "Mercedes";
        }
        return car;
    }
    public final static String car = determineCar();
}
