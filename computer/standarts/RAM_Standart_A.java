package computer.standarts;

import computer.standarts.api.IStandart;

public enum RAM_Standart_A implements IStandart {
    DDR,
    DDR2,
    DIMM;

    public static String[] ramStandartA() {
        RAM_Standart_A[] ram_a = RAM_Standart_A.values();
        String[] ramStandartA = new String[ram_a.length];
        for (int i = 0; i < ram_a.length; i++) {
            ramStandartA[i] = ram_a[i].toString();
        }
        return ramStandartA;
    }
}
