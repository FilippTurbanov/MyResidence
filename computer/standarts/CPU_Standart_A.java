package computer.standarts;

import computer.standarts.api.IStandart;

public enum CPU_Standart_A implements IStandart {
    ZEN,
    ZEN2,
    XEON,
    PILEDRIVER,
    G3;

    public static String[] cpuStandartA() {
        CPU_Standart_A[] cpu_a = CPU_Standart_A.values();
        String[] cpuStandartA = new String[cpu_a.length];
        for (int i = 0; i < cpu_a.length; i++) {
            cpuStandartA[i] = cpu_a[i].toString();
        }
        return cpuStandartA;
    }
}
