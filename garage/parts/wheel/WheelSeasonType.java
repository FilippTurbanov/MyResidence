package garage.parts.wheel;

import java.util.Random;

public enum WheelSeasonType {
    WINTER,
    SUMMER,
    UNIVERSAL;

    public static WheelSeasonType getWheelSeasonType() {
        Random rnd = new Random();
        WheelSeasonType[] tmp = WheelSeasonType.values();
        return tmp[rnd.nextInt(tmp.length)];
    }
}
