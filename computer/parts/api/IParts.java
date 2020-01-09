package computer.parts.api;

public interface IParts {
    boolean checkCPU(String compareableCPU, String standart);
    boolean checkRAM(String compareableRAM, String standart);
    boolean checkHDD(String compareableHDD, String standart);
    String getStandart();
}
