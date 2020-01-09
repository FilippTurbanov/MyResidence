package computer.standarts;

import computer.standarts.api.IStandart;

public enum  HDD_Standart_A implements IStandart {
    SATA,
    SAS,
    ESATA,
    SATA_6G,
    USB_2_0;

    public static String[] hddStandartA() {
        HDD_Standart_A[] hdd_a = HDD_Standart_A.values();
        String[] hddStandartA = new String[hdd_a.length];
        for (int i = 0; i < hdd_a.length; i++) {
            hddStandartA[i] = hdd_a[i].toString();
        }
        return hddStandartA;
    }
}
