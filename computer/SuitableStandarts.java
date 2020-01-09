package computer;

public enum SuitableStandarts {
    ZEN,
    ZEN2,
    XEON,
    G3,
    SATA,
    USB_2_0,
    DDR,
    DDR2;

    public static String[] suitableStandarts() {
        SuitableStandarts[] standarts = SuitableStandarts.values();
        String[] suitableStandarts = new String[standarts.length];
        for (int i = 0; i < standarts.length; i++) {
            suitableStandarts[i] = standarts[i].toString();
        }
        return suitableStandarts;
    }
}
