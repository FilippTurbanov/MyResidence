package computer.parts;

import computer.parts.api.AParts;

public class RAM extends AParts {

    @Override
    public boolean checkRAM(String compareableRAM, String standart) {
        return (compareableRAM.equals(standart));
    }
}
