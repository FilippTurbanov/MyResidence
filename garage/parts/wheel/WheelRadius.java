package garage.parts.wheel;

import java.util.Random;

public enum WheelRadius {
    R13,
    R14,
    R15,
    R16,
    R17,
    R18,
    R19,
    R20;

    public static WheelRadius getWheelRadius() {
        Random rnd = new Random();
        WheelRadius[] tmp = WheelRadius.values();
        return tmp[rnd.nextInt(tmp.length)];
    }
}
