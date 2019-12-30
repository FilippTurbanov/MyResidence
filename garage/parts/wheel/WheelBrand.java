package garage.parts.wheel;

import java.util.Random;

public enum WheelBrand {
    BRIDGESTONE,
    CONTINENTAL,
    NOKIAN;

    public static WheelBrand getWheelBrand() {
        Random rnd = new Random();
        WheelBrand[] tmp = WheelBrand.values();
        return tmp[rnd.nextInt(tmp.length)];
    }
}
