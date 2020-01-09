package computer.parts.api;

public abstract class AParts implements IParts {

    @Override
    public boolean checkCPU(String compareableCPU, String standart) {
        return (compareableCPU.equals(standart));
    }

    @Override
    public boolean checkRAM(String compareableRAM, String standart) {
        return (compareableRAM.equals(standart));
    }

    @Override
    public boolean checkHDD(String compareableHDD, String standart) {
        return (compareableHDD.equals(standart));
    }

    @Override
    public String getStandart() {
        return "A";
    }
}
