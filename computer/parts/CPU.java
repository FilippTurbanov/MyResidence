package computer.parts;

import computer.parts.api.AParts;

public class CPU extends AParts {

    @Override
    public boolean checkCPU(String compareableCPU, String standart) {
        return (compareableCPU.equals(standart));
    }
}
