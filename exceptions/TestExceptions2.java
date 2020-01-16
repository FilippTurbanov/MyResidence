package exceptions;

import exceptions.api.NewException;
import exceptions.api.OneMoreException;

public class TestExceptions2 {
    public static void main(String[] args) throws NewException, OneMoreException {
        TestExceptions2 test = new TestExceptions2();
        int indicator;
        try {
            indicator = test.setParam(5);
            System.out.println("Значение параметра равно: " + indicator);
        } catch (NewException ex) {
            indicator = test.setParam(3);
            System.out.println("Значение параметра равно: " + indicator);
        }
    }

    public int setParam(int param) throws NewException, OneMoreException {
        if (param == 5) {
            throw new NewException("Параметр не может равняться 5");
        } else
            return param;
    }
}
