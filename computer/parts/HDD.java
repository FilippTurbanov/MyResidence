package computer.parts;

import computer.parts.api.AParts;

public class HDD extends AParts {

    @Override
    public boolean checkHDD(String compareableHDD, String standart) {
        return (compareableHDD.equals(standart));
    }
}
